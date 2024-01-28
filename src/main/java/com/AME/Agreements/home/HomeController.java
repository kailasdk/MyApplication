package com.AME.Agreements.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.AME.Agreements.opportunities.Opportunity;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/createproject/{opportunityId}")
    public String getC4cIdFromUser(@PathVariable int opportunityId) {
        Opportunity opportunity= homeService.validateOpportunity(opportunityId);
        if (opportunity.getOpportunityId()==0) {
            return "Opportunity doesnt exist for this id";
        }else{

            homeService.createProject(opportunity);
            return "Opprtunity is being craated with "+opportunity.toString();
        }
    }
}