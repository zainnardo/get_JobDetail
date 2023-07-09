package com.get.detail.get_job_detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.get.detail.get_job_detail")
public class GetJobDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetJobDetailApplication.class, args);
	}

}
