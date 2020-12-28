package icu.bibilailai.core.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"icu.bibilailai.core.service"})
@EnableScheduling
public class SchedulingTasksApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchedulingTasksApplication.class);
    }
}
