package com.kasiarakos.demo.configuration;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kasiarakos.demo.dao.UserRepository;
import com.kasiarakos.demo.domain.User;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            User user = new User(name, name.toLowerCase() + "@kasiarakos.com");
            userRepository.save(user);
        });
        userRepository.findAll().forEach(System.out::println);
    }
}
