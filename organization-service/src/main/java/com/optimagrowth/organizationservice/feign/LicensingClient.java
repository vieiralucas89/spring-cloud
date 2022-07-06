package com.optimagrowth.organizationservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Aqui estou criando uma interface que vai fazer a ligação com o endpoint licensing-service
 */

@FeignClient(value = "licensing-service", url = "http://localhost:8080/v1/licencing")
public interface LicensingClient {

    @GetMapping
    String greeting();

}
