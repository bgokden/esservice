package com.berkgokden.esservice;

/**
 * Endpoint service for forecast data
 * Can be queried with:
 *
 * curl 'http://localhost:8080/forecast?location=062250&forecastdate=2015-09-03'
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.berkgokden.common.WeatherData;
import com.berkgokden.db.WeatherDataRepository;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.elasticsearch.index.query.QueryBuilders.*;

@Controller
@RequestMapping("/forecast")
public class EsserviceController {

    @Autowired
    private WeatherDataRepository repository;

    /**
     * This endpoint service returns the forecasted weatherdata
     * Forecast should match
     * location and date
     * and forecasted time should be later than the date
     * Results will be listed in descending order of their forecasted time
     *
     * @param location location code ex.: 062250
     * @param forecastdate date in format yyyy-MM-dd ex.: 2015-09-03
     * @return list of weatherdata
     */
    @RequestMapping( method = RequestMethod.GET)
    public
    @ResponseBody
    List<WeatherData> getLastestForecast(
            @RequestParam(value = "location", required = true) String location,
            @RequestParam(value = "forecastdate", required = true) String forecastdate) {

        // TODO: throw proper exception when forecastdate is not in the correct format
        Long time = convertDateToUnixTime(forecastdate.trim());

        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(matchAllQuery())
                .withFilter(boolQuery()
                        .must(termQuery("location", location))
                        .must(termQuery("date", forecastdate))
                        .must(rangeQuery("forecastdatetime").gte(time))
                )
                .withSort(SortBuilders.fieldSort("forecastdatetime").order(SortOrder.DESC))
                .build();

        Page<WeatherData> data = repository.search(searchQuery);
        return data.getContent();
    }

    /**
     * The date will be converted to unix time
     * Considering it is the start of the day.
     * ex.: 2015-09-03 will be considered as 2015-09-03T00:00Z
     *
     * @param date date in format yyyy-MM-dd ex.: 2015-09-03
     * @return long unix time
     */
    protected static long convertDateToUnixTime(String date) {
        LocalDate dateTime = LocalDate
                .parse(date.trim(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return dateTime.toEpochDay();
    }
}

