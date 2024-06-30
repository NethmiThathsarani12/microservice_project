package com.example.paymen_sservice.service;

import com.example.paymen_sservice.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {

    PaymentDTO savePayment(PaymentDTO dto);
    PaymentDTO updatePayment(PaymentDTO dto);
    List<PaymentDTO> getAllPayment();
}
