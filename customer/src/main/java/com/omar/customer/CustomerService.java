package com.omar.customer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
    private final RestTemplate restTemplate;
    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        
        //TODO Auto-generated method stub
        Customer customer = Customer.builder()
            .firstName(request.firstName())
            .lastName(request.lastName())
            .email(request.email())
            .build();
            customerRepository.saveAndFlush(customer);
            // @Value("${fraud.service.url}")
            // private String fraudServiceUrl;
            FraudCheckResponse fraudCheckResponse= restTemplate.getForObject(
                "http://localhost:8081/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
            );
            if(fraudCheckResponse.isFraudulent()){
                throw new IllegalStateException("Customer is a fraudster");
            }
            
    }

}
