package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mecid=new Student(
                    1L,
                    "Mecid",
                    "mecidov@gmail.com",
                    LocalDate.of(
                            1990,
                             Month.NOVEMBER,
                            1),
                    31);

            Student elvin=new Student(
                    2L,
                    "Elvin",
                    "aliyev@gmail.com",
                    LocalDate.of(
                            1990,
                            Month.APRIL,
                            20),
                    30);

            repository.saveAll(List.of(mecid,elvin));
        };
    }
}
