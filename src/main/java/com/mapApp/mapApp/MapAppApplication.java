package com.mapApp.mapApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MapAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapAppApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer(){
//		return new WebMvcConfigurerAdapter(){
//			@Override
//			public void addCorsMappings(CorsRegistry registry){
//				registry.addMapping("/").allowedOrigins("http://localhost:8080");
//			}
//		};
//	}

}
