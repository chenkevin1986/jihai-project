package com.jihai.mengmian.swagger2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by kevinchen on 2016/12/14.
 */
@Configuration
@EnableSwagger2
@EnableConfigurationProperties(ApiInfoProperties.class)
public class SwaggerConfiguration {
    @Bean
    public Docket springfoxDocket(ApiInfoProperties apiInfo) {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.ignoredParameterTypes(ApiIgnore.class);
        docket.apiInfo(apiInfo(apiInfo));
        docket.pathMapping("/").select()
        .apis(RequestHandlerSelectors.any())
        .paths(regex("^.*(?<!error)$")).build();
        return docket;
    }

    @Bean
    ApiInfo apiInfo(ApiInfoProperties apiInfoProperties) {
        Contact contact = apiInfoProperties.getContact();
        ApiInfo apiInfo = new ApiInfo(apiInfoProperties.getTitle(),
                apiInfoProperties.getDescription(),
                apiInfoProperties.getVersion(),
                apiInfoProperties.getTermsOfServiceUrl(),
                new springfox.documentation.service.Contact(contact.getName(),
                        contact.getUrl(),
                        contact.getEmail()),
                apiInfoProperties.getLicense(),
                apiInfoProperties.getLicenseUrl());
        return apiInfo;
    }

    @Bean
    public SecurityConfiguration security() {
        return new SecurityConfiguration(null, // "client id",
                null, // "client secret",
                null, // "realm",
                null, // "app",
                "bearer" , ApiKeyVehicle.HEADER, "Authorization", "," /* scope separator */);
    }
}
