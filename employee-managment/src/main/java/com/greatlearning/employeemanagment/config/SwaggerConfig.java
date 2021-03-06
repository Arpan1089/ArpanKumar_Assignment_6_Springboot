package com.greatlearning.employeemanagment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public ApiSelectorBuilder employeeApi() {

		return new Docket(DocumentationType.SWAGGER_2).groupName("Employee-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.greatlearning.employeemanagment.controller"));
	}
}
