package com.omar.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public record CustomerController (CustomerService customerService) {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        //TODO: process POST request
        log.info("Registering customer: {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
    

}
