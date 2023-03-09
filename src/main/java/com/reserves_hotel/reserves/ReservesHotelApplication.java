package com.reserves_hotel.reserves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReservesHotelApplication {
	
	@RequestMapping("/")
	public String home() {
        return "Hello Docker World";
    }

	public static void main(String[] args) {
		SpringApplication.run(ReservesHotelApplication.class, args);
	}
	
	
}
