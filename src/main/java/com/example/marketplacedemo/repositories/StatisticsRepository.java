package com.example.marketplacedemo.repositories;

import com.example.marketplacedemo.models.StatisticsDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatisticsRepository extends MongoRepository<StatisticsDto,String> {
}
