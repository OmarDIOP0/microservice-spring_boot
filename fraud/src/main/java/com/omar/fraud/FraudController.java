package com.omar.fraud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {
    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerID ) {
        boolean isFraudulentCustomer =  fraudCheckService.isFraudulentCustomer(customerID);
        log.info("Fraud check for customer: {}", customerID);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
    
    
}
