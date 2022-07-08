package com.optimagrowth.license.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "licensing-service", url = "http://localhost:8088/organizations")
public interface OrganizationClient {

    @GetMapping
    String getOrganization();
}
