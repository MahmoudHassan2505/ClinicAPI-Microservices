package com.SPYDER.Clinic.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p->p.path("/doctors/**").uri("lb://doctor-service/**"))
                .route(p->p.path("/payments/**").uri("lb://payment-service/**"))
                .route(p->p.path("/patients/**").uri("lb://patient-service/**"))
                .build();
    }

}
