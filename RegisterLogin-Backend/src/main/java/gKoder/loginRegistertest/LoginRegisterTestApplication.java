package gKoder.loginRegistertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories(basePackages = "gKoder.loginRegistertest")
public class LoginRegisterTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterTestApplication.class, args);
	}

}
