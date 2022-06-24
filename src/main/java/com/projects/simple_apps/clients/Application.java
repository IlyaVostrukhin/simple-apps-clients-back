package com.projects.simple_apps.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
//        SpringApplication app = new SpringApplication(Application.class);
//        System.out.print("Starting app with System Args: [" );
//        for (String s : args) {
//            System.out.print(s + " ");
//        }
//        System.out.println("]");
//        app.run(args);
    }
}
