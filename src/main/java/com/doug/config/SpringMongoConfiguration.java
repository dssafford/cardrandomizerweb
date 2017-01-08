package com.doug.config;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Doug on 9/10/16.
 */

@EnableMongoRepositories
public class SpringMongoConfiguration {

//	@Bean
//	public MongoTemplate mongoTemplate() throws Exception {
//		return new MongoTemplate(new MongoClient("localhost:27017"),  "CardMemory");
//	}

}