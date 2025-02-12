package com.app.payloads;

import com.app.entites.Bank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
	private Long paymentId;
	private String paymentMethod;
	private Bank bank;

}
