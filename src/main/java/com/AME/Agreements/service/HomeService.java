package com.AME.Agreements.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AME.Agreements.controllers.AgreementController;
import com.AME.Agreements.model.Agreement;
import com.AME.Agreements.model.BusinessLine;
import com.AME.Agreements.model.Opportunity;

@Service
public class HomeService {
    @Autowired
    OpportunitiesService opportunitiesService;
    @Autowired
    AgreementService agreementService;
    @Autowired
    AgreementController agreementController;
    
    public void createProject(Opportunity opportunity) {

        // Agreement agreement= new Agreement(1000,10001,"first offshore agreement","India",opportunity.getBidduedate(),opportunity.getOpportunityId(),"India",false,false,false,false,"preparation",10000000);
        // Agreement agreement = new Agreement(opportunity.getOpportunityId(),opportunity.getCountry(),opportunity.getBidduedate(),new BusinessLine());
        //code for wrting create agreement
        // agreementController.createAgreement(agreement);
        // agreementService.saveAgreement(agreement);
        }

    public Opportunity validateOpportunity(int opportunityId) {
        List<Opportunity> list = opportunitiesService.getOpportunityDetails(opportunityId);
        if(!list.isEmpty()){
           return list.get(0);
        }else{
            return new Opportunity();
        }

    }
}
