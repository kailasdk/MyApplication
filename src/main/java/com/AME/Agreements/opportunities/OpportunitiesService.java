package com.AME.Agreements.opportunities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpportunitiesService {

    @Autowired
    OpportunitiesRepository opportunitiesRepository;

    public List<Opportunity> getOpportunityDetails(int opportunityId) {
        return opportunitiesRepository.getByOpportunityId(opportunityId);
    }
    
}
