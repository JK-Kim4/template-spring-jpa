package com.template.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // SpringBoot 자동 설정 Annotation : 스프링 Bean 읽기와 생성 등 자동으로 설정, 해당 어노테이션은 반드시 프로젝트 최 상단에 위치해야함
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
