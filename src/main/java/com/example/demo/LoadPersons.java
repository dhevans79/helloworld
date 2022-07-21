package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadPersons {

    private static final Logger log = LoggerFactory.getLogger(LoadPersons.class);

    @Bean
    CommandLineRunner initDatabase(PersonRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Person("David",   "Evans", 42, new Date(1979, 8, 29))));
            log.info("Preloading " + repository.save(new Person("Raphael", "Evans", 12, new Date(2009, 12, 01))));
        };
    }
}
