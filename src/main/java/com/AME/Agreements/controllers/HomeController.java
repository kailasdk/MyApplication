package com.AME.Agreements.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.AME.Agreements.model.Opportunity;
import com.AME.Agreements.service.HomeService;
import com.google.gson.Gson;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/createproject/{opportunityId}")
    public String getC4cIdFromUser(@PathVariable int opportunityId) {
        Opportunity opportunity = homeService.validateOpportunity(opportunityId);
            
            return new Gson().toJson(opportunity);
        
        // if (opportunity.getOpportunityId() == 0) {
        //     return "Opportunity doesnt exist for this id";
        // } else {

        //     // homeService.createProject(opportunity); create a project from agreement
        //     // controller
        //     return opportunity.toString();
        // }
    }
}