package jenkins_ci_cd.jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class JenkinsDemoApplication {

	@GetMapping("/greetings/{name}")
	public String greeting(@PathVariable String name){
		return "Hello" + name + "Congratulation you have successfully compled !";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
