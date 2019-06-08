package com.st.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class AppRunner implements CommandLineRunner{
	
	@Value("${my.name}")
	private String name;
	@Value("${my.country}")
	private String  country;
	@Value("${my.deta}")
	private String details;
	@Value("${my.code}")
	private String code;
	
		@Override
		public void run(String... args) throws Exception {
		System.out.println("Runner Class.....");
		System.out.println(this);	
		}
		
}
