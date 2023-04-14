package com.College.CollegeProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.College.Dao.CollegeDo;

@SpringBootApplication

public class CollegeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeProjectApplication.class, args);
	}

	

}
