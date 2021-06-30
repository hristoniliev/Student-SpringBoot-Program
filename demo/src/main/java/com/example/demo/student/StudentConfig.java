package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student hristo = new Student( "Hristo", "hristoniliev@gmail.com", LocalDate.of(1998, AUGUST, 31));
           Student polina = new Student( "Polina", "polinamar@abv.bg", LocalDate.of(1996, JULY, 14));
           repository.saveAll(List.of(hristo, polina));
        };
    }

}
