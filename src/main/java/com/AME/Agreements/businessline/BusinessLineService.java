package com.AME.Agreements.businessline;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessLineService {

    @Autowired
    BusinessLineRepository businessLineRepository;
    public Optional<BusinessLine> getBusinessLinesData(Integer id) {


        
        return businessLineRepository.findById(id);
        // throw new UnsupportedOperationException("Unimplemented method 'getBusinessLinesData'");
    }

   
    
}
