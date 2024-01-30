package com.AME.Agreements.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AME.Agreements.model.BusinessLine;
import com.AME.Agreements.repository.BusinessLineRepository;

@Service
public class BusinessLineService {

    @Autowired
    BusinessLineRepository businessLineRepository;

    public List<BusinessLine> getBusinessLinesData(String name) {

        return businessLineRepository.getByBusinesslineName(name);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getBusinessLinesData'");
    }

    public void saveBusinessLine(BusinessLine businessLine) {
        // TODO Auto-generated method stub
        businessLineRepository.save(businessLine);
    }

}
