package com.balatamilmani.multipledsdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class DataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource customerDataSource() {
        DataSource customerDataSource = DataSourceBuilder.create().build();
        return customerDataSource;
    }

    @Bean(value = "orderDataSource")
    @ConfigurationProperties(prefix="spring.order-datasource")
    public DataSource orderDataSource() {
        return DataSourceBuilder.create().build();
    }
}
