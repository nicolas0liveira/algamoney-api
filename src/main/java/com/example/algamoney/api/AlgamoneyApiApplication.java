package com.example.algamoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgamoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApiApplication.class, args);
	}
	
	
	
//	//para mais detalhes do cors (https://spring.io/guides/gs/rest-service-cors/)
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/*").allowedOrigins("http://localhost:8000");
//			}
//		};
////Não utilizar pois a integração com o OAuth2 não funciona. O Browser manda o OPTION e não temos controle sobre a requisição
//	}
	
}
