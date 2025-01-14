package com.omar.fraud;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(
        name = "fraud_id_sequence",
        sequenceName = "fraud_id_sequence",
        allocationSize = 1
        )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "fraud_id_sequence"
        )
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}
