package com.nco.troli.data.source;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.nco.troli.env.Constants.POSTGRES_DATASOURCE_CONFIGURATION;

@Configuration
public class PostgresDataSource {

    @Bean
    @ConfigurationProperties(POSTGRES_DATASOURCE_CONFIGURATION)
    public HikariDataSource hikariDataSource() {
        return DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
    }
}
