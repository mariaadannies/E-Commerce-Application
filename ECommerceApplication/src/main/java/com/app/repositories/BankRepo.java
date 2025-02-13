package com.app.repositories;

import com.app.entites.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepo extends JpaRepository<Bank, Long> {

    List<Bank> findAll();

    Bank findBankByBankNameLike(String bankName);

    Bank findBankByAccountNumber(String accountNumber);

}
