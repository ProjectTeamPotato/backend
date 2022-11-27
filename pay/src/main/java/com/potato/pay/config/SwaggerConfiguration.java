package com.potato.pay.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1-pay")
                .pathsToMatch("/test/**")
                .pathsToMatch("/pay/**")
                .build();
    }

    @Bean
    public OpenAPI springOpenApi() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Pay Api")
                                .description("Pay Desc")
                                .version("0.0.1")
                );
    }

}