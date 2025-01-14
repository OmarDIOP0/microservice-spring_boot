package com.omar.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder  // TODO: getter et settter
@Entity
@AllArgsConstructor // TODO: constructeur avec parametre
@NoArgsConstructor // TODO: constructeur sans parametre
public class Customer {
    @Id
    @SequenceGenerator(
        name = "customer_id_sequence", 
        sequenceName = "customer_id_sequence", 
        allocationSize = 1)
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "customer_id_sequence"
        )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
