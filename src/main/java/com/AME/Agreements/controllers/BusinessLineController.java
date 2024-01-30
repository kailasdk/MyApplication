package com.AME.Agreements.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.AME.Agreements.model.BusinessLine;
import com.AME.Agreements.service.BusinessLineService;

@RestController
public class BusinessLineController {
    @Autowired
    BusinessLineService businessLineService;
    List<BusinessLine> businessLines = new ArrayList<>();

    @GetMapping("/businessline/{name}")
    public List<BusinessLine> getBusinessLinesData(@PathVariable String name){
        return businessLineService.getBusinessLinesData(name);
    }
}
