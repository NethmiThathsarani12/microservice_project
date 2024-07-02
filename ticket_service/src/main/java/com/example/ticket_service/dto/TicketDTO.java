package com.example.ticket_service.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TicketDTO {

    private String id;
    private String vehicleId;
    private String date;
    private String userId;

}
