package com.berkgokden.db;


import com.berkgokden.common.WeatherData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Elasticsearch bean to store/query WeatherData
 *
 * interface methods to standard queries can be added with define by method name.
 * In our process search method used with native search query creation
 * so this interface is empty and only defines object type and id type.
 */
public interface WeatherDataRepository extends ElasticsearchRepository<WeatherData, String> {
}
