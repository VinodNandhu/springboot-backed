package com.myblog8;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Myblog8Application {

	public static void main(String[] args) {
		SpringApplication.run(Myblog8Application.class, args);
	}
	@Bean// when external library is add we need use @bean annotation
    public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
