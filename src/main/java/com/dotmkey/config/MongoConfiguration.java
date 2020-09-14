package com.dotmkey.config;

import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

public class MongoConfiguration {

    public @Bean MongoDatabaseFactory mongoDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(MongoClients.create(), "sias");
    }

}
