package com.app.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "banks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bankId;

    @NotBlank
    @Size(min = 3, message = "Bank Name must contain atleast 3 characters")
    private String bankName;

    @NotBlank
    @Size(min = 6, message = "Bank Account Number must contain atleast 6 characters")
    private String accountNumber;
}
