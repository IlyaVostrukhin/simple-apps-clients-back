package com.projects.simple_apps.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        System.out.print("Starting app with System Args: [" );
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println("]");
        app.run(args);
    }
}
