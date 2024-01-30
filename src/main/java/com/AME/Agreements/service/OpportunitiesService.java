package com.AME.Agreements.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AME.Agreements.model.Opportunity;
import com.AME.Agreements.repository.OpportunitiesRepository;

@Service
public class OpportunitiesService {

    @Autowired
    OpportunitiesRepository opportunitiesRepository;

    public List<Opportunity> getOpportunityDetails(int opportunityId) {
        return opportunitiesRepository.getByOpportunityId(opportunityId);
    }
    
}
