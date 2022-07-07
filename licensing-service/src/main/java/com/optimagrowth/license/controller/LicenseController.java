package com.optimagrowth.license.controller;

import com.optimagrowth.license.model.License;
import com.optimagrowth.license.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping(value = "v1/licencing")
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    @GetMapping("/{id}")
    public List<License> getString(@PathVariable String id) throws TimeoutException {
        return licenseService.getLicensesByOrganization(id);
    }
}