package com.banking.accountservice.repository;

import com.banking.accountservice.Entity.Account;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {
    boolean existsByEmail(String email);
    boolean existsByAccountNumber(String AccountNumber);
    Optional<Account> findByAccountNumber(String AccountNumber);
}
