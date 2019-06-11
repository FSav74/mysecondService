package mysecondService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;

import mysecondService.controller.GameController;


@ComponentScan(basePackageClasses = GameController.class)
@EnableAutoConfiguration
public final class Application {
	
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}

}
