package com.petly.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI petlyOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Petly API")
                        .description("Documentação da API do sistema Petly")
                        .version("1.0"));
    }
}