package com.mjtal.gulimall.search.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: june
 * @Date: 2023/9/22 14:57
 */
@Configuration
public class ElasticConfig {

    @Bean
    public RestClient esClient(){
        RestClient restClient = RestClient.builder(
                new HttpHost("192.168.163.136", 9200)).build();

        return restClient;
//        // Create the transport with a Jackson mapper
//        ElasticsearchTransport transport = new RestClientTransport(
//                restClient, new JacksonJsonpMapper());
//
//        // And create the API client
//        ElasticsearchClient client = new ElasticsearchClient(transport);
    }
}
