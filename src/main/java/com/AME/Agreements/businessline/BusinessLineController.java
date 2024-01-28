package com.AME.Agreements.businessline;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
