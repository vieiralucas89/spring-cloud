package com.optimagrowth.license.config;

import com.optimagrowth.license.utils.UserContext;
import com.optimagrowth.license.utils.UserContextHolder;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header(UserContext.CORRELATION_ID, UserContextHolder.getContext().getCorrelationId());
            requestTemplate.header(UserContext.AUTH_TOKEN, UserContextHolder.getContext().getAuthToken());
        };
    }
}