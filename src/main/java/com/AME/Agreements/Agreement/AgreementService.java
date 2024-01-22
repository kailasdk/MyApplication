package com.AME.Agreements.Agreement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgreementService {

    @Autowired
    AgreementRepository agreementRepository;
    public List<Agreement> getAllAgreements() {
        // TODO Auto-generated method stub

        List<Agreement> agreements= new ArrayList<>();
        agreementRepository.findAll().forEach(agreements::add);
        return agreements;
    }

    
} 