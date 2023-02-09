package com.example.marketplacedemo;

import com.example.marketplacedemo.models.StatisticsDto;
import com.example.marketplacedemo.repositories.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketplaceDemoApplication  implements CommandLineRunner {

    @Autowired
    private StatisticsRepository mongoRepo;

    public static void main(String[] args) {
         SpringApplication.run(MarketplaceDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mongoRepo.save(new StatisticsDto(99,202));
        mongoRepo.save(new StatisticsDto(55,66));
    }
}
