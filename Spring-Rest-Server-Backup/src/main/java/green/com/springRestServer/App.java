package green.com.springRestServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Message Web Service 
 * 
 * Runs on the port specified in application.properties in the  src/main/resources/ directory
 *
 */
@SpringBootApplication
@Configuration
@ComponentScan( basePackages = {"green.com.springRestServer","green.com.model","green.com.repository","green.com.service"})
public class App {

    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(App.class, args);
    }
}

/*
 Source: https://springframework.guru/spring-component-scan/ 
*/