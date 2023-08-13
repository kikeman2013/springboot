package com.kike.projectmarket;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMarketApplication.class, args);
	}


}
