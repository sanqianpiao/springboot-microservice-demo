package com.example.demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class MyTest {
    @Container
    private static final MongoDBContainer MONGO_DB_CONTAINER = new MongoDBContainer("mongo:4.0.10");

    @Test
    public void test() {
        MongoClient mongoClient = MongoClients.create(MONGO_DB_CONTAINER.getReplicaSetUrl());
        // Use the mongoClient instance to interact with the MongoDB container
    }
}