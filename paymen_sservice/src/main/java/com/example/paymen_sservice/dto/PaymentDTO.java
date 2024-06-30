package com.example.paymen_sservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PaymentDTO {

    private String id;
    private String date;
    private double price;
    private String ticketId;
    private String type;
}
