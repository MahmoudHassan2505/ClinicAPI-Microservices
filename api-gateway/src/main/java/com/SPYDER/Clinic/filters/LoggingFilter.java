package com.SPYDER.Clinic.filters;


import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Component
public class LoggingFilter implements GlobalFilter {

    Logger logger = Logger.getLogger(LoggingFilter.class.getName());

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Request Coming.....");

        String request = exchange.getRequest().getURI().toString();
        logger.info("URL: " +request);

        //filter throw country name

        String Ip = exchange.getRequest().getRemoteAddress().toString();
        logger.info("IP: " +Ip);

        return chain.filter(exchange);
    }
}
