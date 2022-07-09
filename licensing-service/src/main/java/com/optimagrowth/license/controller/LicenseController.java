package com.optimagrowth.license.controller;

import com.optimagrowth.license.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping(value = "/licensing")
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

//    @RolesAllowed({ "ADMIN", "USER" })
//    @GetMapping()
//    public List<License> getString() throws TimeoutException {
//        return licenseService.getLicensesByOrganization("2");
//    }

    @GetMapping()
    public String getString() throws TimeoutException {
        return "Quem não tem as manha não entra, nãoo...docee doceee como melll...";
    }
}