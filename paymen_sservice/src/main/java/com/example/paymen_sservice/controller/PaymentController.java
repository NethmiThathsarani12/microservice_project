package com.example.paymen_sservice.controller;

import com.example.paymen_sservice.dto.PaymentDTO;
import com.example.paymen_sservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/payment")
public class PaymentController{

    @Autowired
    private PaymentService service;

    @GetMapping
    public List<PaymentDTO> getAllPayment(){
        return service.getAllPayment();
    }

    @PostMapping
    public PaymentDTO savePayment(@RequestBody PaymentDTO dto){
        return service.savePayment(dto);
    }

    @PutMapping
    public PaymentDTO updateTicket(@RequestBody PaymentDTO dto){
        return service.updatePayment(dto);
    }
}
