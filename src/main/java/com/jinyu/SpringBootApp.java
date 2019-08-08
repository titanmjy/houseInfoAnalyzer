package com.jinyu;

import com.jinyu.dao.HouseSourceInfoRepo;
import com.jinyu.model.HouseSourceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@SpringBootConfiguration
//@ComponentScan("com.jinyu")
@EnableJpaRepositories(basePackages = "com.jinyu.dao")
public class SpringBootApp  implements CommandLineRunner {
    @Autowired
    private HouseSourceInfoRepo houseSourceInfoRepo;


    @Bean
    public DataSource getDataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
//        dataSource.setUrl("jdbc:sqlite:F:/CodeStation/jaProject/HouseAnalyze/houses.db");
        dataSource.setUrl("jdbc:sqlite:houses.db");
        return dataSource;
    }

//    @Bean
//    public EntityManagerFactory entityManagerFactory(){
//
//    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        HouseSourceInfo houseSourceInfo = new HouseSourceInfo();
        houseSourceInfo.setAddress("海盐路21号3栋");
        houseSourceInfo.setUnitPrice(90000);
        houseSourceInfo.setTotalPrice(9000000);
        houseSourceInfo.setArea(100);
        HouseSourceInfo savedInfo = houseSourceInfoRepo.save(houseSourceInfo);
    }
}
