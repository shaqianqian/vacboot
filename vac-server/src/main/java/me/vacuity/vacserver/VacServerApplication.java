package me.vacuity.vacserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VacServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VacServerApplication.class, args);
    }

}
