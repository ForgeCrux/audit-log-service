package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Audit Log Service")
                                .description("Microservice for recording immutable audit events across the platform. Supports append-only writes, actor and resource filtering, and export for compliance. ")
                                .contact(
                                        new Contact()
                                                .name("Compliance Engineering Team")
                                                .email("audit@example.com")
                                )
                                .version("1.0.0")
                )
        ;
    }
}
