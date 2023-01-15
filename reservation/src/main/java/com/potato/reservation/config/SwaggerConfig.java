package com.potato.reservation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi testApi() {
        return GroupedOpenApi.builder()
                .group("v1-test")
                .pathsToMatch("/test/**")
                .build();
    }

    @Bean
    public OpenAPI springOpenApi() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Reservation Api")
                                .description("Reservation Desc")
                                .version("0.0.1")
                );
    }

}
