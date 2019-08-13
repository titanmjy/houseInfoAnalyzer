package com.jinyu;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean(destroyMethod = "", name = "EmbeddedDataSource")
    public DataSource getDataSource() {
//        SQLiteDataSource dataSource = new SQLiteDataSource();
////        dataSource.setUrl("jdbc:sqlite:F:/CodeStation/jaProject/HouseAnalyze/houses.db");
//        dataSource.setUrl("jdbc:sqlite:houses.db");
//        return dataSource;
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:houses.db");
        dataSourceBuilder.type(SQLiteDataSource.class);
        return dataSourceBuilder.build();
    }


}
