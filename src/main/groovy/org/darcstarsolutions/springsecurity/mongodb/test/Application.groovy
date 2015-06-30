package org.darcstarsolutions.springsecurity.mongodb.test

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

/**
 * Created by mharris on 6/30/15.
 */

@SpringBootApplication
@EnableConfigurationProperties
class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args)
    }

    @Override
    void run(String... args) throws Exception {

    }
}
