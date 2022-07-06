package com.optimagrowth.license.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "v1/licencing")
public class LicenseController {


    @GetMapping
    public String getString() {
        return "Acordeiiii...";
    }
}