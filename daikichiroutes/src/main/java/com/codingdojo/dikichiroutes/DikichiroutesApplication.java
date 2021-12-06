package com.codingdojo.dikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestContoller
public class DikichiroutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DikichiroutesApplication.class, args);
	}
	
	@RequestMapping("/dikichi")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/dikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/dikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	

}
