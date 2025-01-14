package com.omar.fraud;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class FraudCheckService {
    private final FraudCheckHistoryRepositry fraudCheckHistoryRepositry;

    public FraudCheckService(FraudCheckHistoryRepositry fraudCheckHistoryRepositry) {
        this.fraudCheckHistoryRepositry = fraudCheckHistoryRepositry;
    }
    public boolean isFraudulentCustomer(Integer customerId){
        fraudCheckHistoryRepositry.save(
            FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build()
        );
        return false;
    }
}
