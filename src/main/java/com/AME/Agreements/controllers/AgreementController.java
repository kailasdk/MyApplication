package com.AME.Agreements.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.AME.Agreements.model.Agreement;
import com.AME.Agreements.service.AgreementService;
import com.AME.Agreements.service.PresetService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class AgreementController {

    @Autowired
    private AgreementService agreementService;
    @Autowired
    private PresetService presetService;

    @GetMapping("/agreements")
    public List<Agreement> getAllAgreements() {
        return agreementService.getAllAgreements();

    }

    @GetMapping("/callclient")
    public String getClient() {
        
   return presetService.getTeams();
    }
    @GetMapping("/token")
    public String getToken() {
        
   return presetService.getToken();
    }

    @PostMapping("/createAgreement")
    public void createAgreement(@RequestBody Agreement agreement) {

        agreementService.saveAgreement(agreement);
    }
}
