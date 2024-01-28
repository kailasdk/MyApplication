package com.AME.Agreements.Agreement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AgreementController {

    @Autowired
    private AgreementService agreementService;

    @GetMapping("/agreements")
    public List<Agreement> getAllAgreements() {
        return agreementService.getAllAgreements();

    }
    
    

}
