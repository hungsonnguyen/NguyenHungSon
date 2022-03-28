package com.example.text_exam_module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TextExamModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextExamModuleApplication.class, args);
        SpringApplication.run(CaseStudyApplication.class, args);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123456"));
    }

}
