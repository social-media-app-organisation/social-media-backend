package org.models;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
public class UserModuleApp {
    public static void main(String[] args) {
        SpringApplication.run(UserModuleApp.class,args);
    }

    @GetMapping("/hello-user")
    public String get(){
        return "hello user";
    }
}
