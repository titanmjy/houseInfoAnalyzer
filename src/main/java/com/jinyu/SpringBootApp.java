package com.jinyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.sqlite.SQLiteDataSource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@SpringBootConfiguration
@EnableJpaRepositories(basePackages = "com.jinyu.dao")
public class SpringBootApp {

//    @Bean("entityManagerFactory")
//    LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setDataSource(dataSource());
//        return bean;
//    }

    @Bean(name = "entityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactory(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(dataSource()).build();
    }

    @Bean("dataSource")
    DataSource dataSource() {
//        SQLiteDataSource dataSource = new SQLiteDataSource();
//        dataSource.setUrl("jdbc:sqlite:F:/CodeStation/jaProject/HouseAnalyze/houses.db");
//        dataSource.setUrl("jdbc:sqlite:houses.db");
//        return dataSource;
        DataSource dataSource = DataSourceBuilder.create().build();
        return dataSource;
    }




    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

//    https://www.jianshu.com/p/107742f2171d

}
