package com.example.paymen_sservice.repo;

import com.example.paymen_sservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,String > {
}
