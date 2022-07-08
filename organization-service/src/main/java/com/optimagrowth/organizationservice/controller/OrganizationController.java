package com.optimagrowth.organizationservice.controller;

import com.optimagrowth.organizationservice.feign.LicensingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @Autowired
    private LicensingClient organizationFeignClient;

    @GetMapping
    public String getOrganization() {
        return organizationFeignClient.greeting();
    }


}
