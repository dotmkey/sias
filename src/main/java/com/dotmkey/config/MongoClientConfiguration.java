package com.dotmkey.config;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collections;

@Configuration
public class MongoClientConfiguration extends AbstractMongoClientConfiguration {

    @Override
    public String getDatabaseName() {
        return "sias";
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder
            .credential(MongoCredential.createCredential("mongo", "mongo", "mongo".toCharArray()))
            .applyToClusterSettings(settings -> {
                settings.hosts(Collections.singletonList(new ServerAddress("mongo", 27017)));
            })
        ;
    }

}
