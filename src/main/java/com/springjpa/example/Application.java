package com.springjpa.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepository repository) {
        return (args) -> {

            // save some users
            repository.save(new User("user1"));
            repository.save(new User("user2"));
            repository.save(new User("user3"));

            // get all users
            System.out.println("Getting all users...");
            repository.findAll().forEach(System.out::println);

            // get the user by id
            System.out.println("Get the user by id");
            User user = repository.findById(1L);
            System.out.println(user);

        };
    }
}
