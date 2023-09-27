package ma.socialmedia.socialmediaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SocialmediaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialmediaAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String get(){
		return "hello";
	}

}
