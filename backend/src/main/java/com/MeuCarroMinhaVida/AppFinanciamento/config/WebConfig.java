package com.MeuCarroMinhaVida.AppFinanciamento.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
	
	public void addCorsMapping(CorsRegistry registry) {
		registry.addMapping("/api/**").allowedOrigins("https://localhost:3000");
	}
}
