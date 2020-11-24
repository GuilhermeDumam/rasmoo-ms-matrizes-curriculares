package com.rasmoo.cliente.escola.matrizescurriculares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MatrizesCurricularesApplication extends SpringBootServletInitializer  {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MatrizesCurricularesApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MatrizesCurricularesApplication.class, args);
	}

}
