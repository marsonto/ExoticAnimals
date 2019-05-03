package dataapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebSecurity(debug = true)
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
