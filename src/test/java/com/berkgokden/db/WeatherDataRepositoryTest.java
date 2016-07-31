package com.berkgokden.db;

import com.berkgokden.common.WeatherData;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

import static org.elasticsearch.index.query.QueryBuilders.*;
import static org.junit.Assert.*;

/**
 * Created by developer on 7/30/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherDataRepositoryTest {
    @Autowired
    private WeatherDataRepository repository;

    @Test
    public void shouldPassWhenWeatherDataQueriedReturnExpectedResult() throws Exception {
        String location = "062250";
        Long time = 1442707200L;

        for (int i = -1000; i < 0; i+=100) {
            repository.index(new WeatherData(location+"|"+(time+i), location, (time+i)));
        }

        Set<String> expectedSet = new HashSet<>();
        for (int i = 0; i < 1000; i+=100) {
            expectedSet.add(location+"|"+(time+i));
            repository.index(new WeatherData(location+"|"+(time+i), location, (time+i)));
        }

        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(matchAllQuery())
                .withFilter(boolQuery()
                        .must(termQuery("location", location))
                        .must(rangeQuery("forecastdatetime").gte(time))
                )
                .withSort(SortBuilders.fieldSort("forecastdatetime").order(SortOrder.DESC))
                .build();

        Page<WeatherData> data= repository.search(searchQuery);

        assertEquals(expectedSet.size(), data.getTotalElements());
        for (WeatherData weatherData : data) {
            assertTrue(expectedSet.contains(weatherData.getId()));
        }

    }
}