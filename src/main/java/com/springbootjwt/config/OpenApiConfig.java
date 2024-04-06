package com.springbootjwt.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI myOpenAPI(){
        final  String securitySchemaName = "bearerAuth";

        Info info = new Info()
                .title("Spring Boot Spring Security JWT Authentication.")
                .version("1.0.0")
                .description("This API exposes endpoints of spring boot spring security jwt authentication");

        return new OpenAPI()
                .info(info)
                .addSecurityItem(
                        new SecurityRequirement()
                                .addList(securitySchemaName)
                )
                .components(
                        new Components()
                                .addSecuritySchemes(securitySchemaName,
                                        new SecurityScheme()
                                                .name(securitySchemaName)
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("bearer")
                                                .bearerFormat("JWT")
                                )
                );
    }

}
