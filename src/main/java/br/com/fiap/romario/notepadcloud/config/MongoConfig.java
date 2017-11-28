package br.com.fiap.romario.notepadcloud.config;

import org.springframework.beans.factory.annotation.Value;

public class MongoConfig extends AbstractMongoConfiguration
{
    @Value("${spring.data.mongodb.host}")
    private String mongoHost;

    @Value("${spring.data.mongodb.port}")
    private int mongoPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoDB;

    @Value("${spring.data.mongodb.username}")
    private String mongoUsername;

    @Value("${spring.data.mongodb.password}")
    private String mongoPassword;

    @Override
    protected String getDatabaseName(){
        return mongoDB;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(singletonList(new ServerAddress(mongoHost, mongoPort)),singletonList(MongoCredencial.createCredential(
                mongoUsername, mongoDB, mongoPassword.toCharArray()
        )));

    }
}

