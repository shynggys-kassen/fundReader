package app.web;

import app.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

//@SpringBootApplication
@ComponentScan(basePackages = {"app.controllers"})
public class App{
    public static void main(String[] args) {
        System.out.println("The server beings");
        SpringApplication.run(AppConfig.class, args);
    }
}