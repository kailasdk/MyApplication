package com.AME.Agreements.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.AME.Agreements.model.Agreement;
import com.AME.Agreements.service.AgreementService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AgreementController {

    @Autowired
    private AgreementService agreementService;

    @GetMapping("/agreements")
    public List<Agreement> getAllAgreements() {
        return agreementService.getAllAgreements();

    }

    @PostMapping("/createAgreement")
    public void createAgreement(@RequestBody Agreement agreement) {

        agreementService.saveAgreement(agreement);
    }

    private long businesslineId;
    private String businesslineName;
    private BigDecimal businessValue;
    private boolean isActive;
    private boolean isDigital;
    private boolean CLMWorkFlow;
}
