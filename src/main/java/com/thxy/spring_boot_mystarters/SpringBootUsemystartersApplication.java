package com.thxy.spring_boot_mystarters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thxy.spring_boot_mystarters.MyService;

@RestController
@SpringBootApplication
public class SpringBootUsemystartersApplication {
	@Autowired(required = false)
	MyService myService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUsemystartersApplication.class, args);
	}

	@RequestMapping("/testStarters")
	public String index() {
		return myService.sayMsg();
	}
}
