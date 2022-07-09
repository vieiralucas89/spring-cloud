package com.optimagrowth.gatewayserver.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Objects;


@Order(0)
@Slf4j
@Component
public class CorrelationTrackingPostFilter implements GlobalFilter {

    public static final String CORRELATION_ID = "correlation-id";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("Injecting correlation into response...");

        HttpHeaders header = exchange.getRequest().getHeaders();

        exchange.getResponse().getHeaders().add(CORRELATION_ID, getCorrelationId(header));

        return chain.filter(exchange);
    }

    private String getCorrelationId(HttpHeaders header) {
        return Objects.requireNonNull(header.get(CORRELATION_ID)).iterator().next();
    }

}