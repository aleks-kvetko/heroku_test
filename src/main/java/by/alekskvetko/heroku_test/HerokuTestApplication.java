package by.alekskvetko.heroku_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class HerokuTestApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(HerokuTestApplication.class, args);
	}
}
