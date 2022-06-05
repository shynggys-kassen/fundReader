package app.config;
import app.controllers.FundController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class AppConfig {
    @Bean
    public FundController fundController(){
        System.out.println("The bean is created");
        return new FundController();
    }
}
