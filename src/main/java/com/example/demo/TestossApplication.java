package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestossApplication {

	static boolean debugFlag = true;

	public static void main(String[] args) {
		SpringApplication.run(TestossApplication.class, args);

		// !!! debug !!!
		if(debugFlag){
			System.out.println("debigFlag is true @TestossApplication.java");
		}

	}

}
