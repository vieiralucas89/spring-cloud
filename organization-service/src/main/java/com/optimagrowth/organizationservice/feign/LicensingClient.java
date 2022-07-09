package com.optimagrowth.organizationservice.feign;

import com.optimagrowth.organizationservice.config.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Aqui estou criando uma interface que vai fazer a ligação com o endpoint licensing-service
 */

@FeignClient(value = "licensing-service", url = "http://localhost:8082/licensing", configuration = ClientConfiguration.class)
public interface LicensingClient {

    @GetMapping
    String greeting();

}
