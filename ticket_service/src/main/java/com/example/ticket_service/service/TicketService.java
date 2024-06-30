package com.example.ticket_service.service;

import com.example.ticket_service.dto.TicketDTO;

import java.util.List;

public interface TicketService {

    TicketDTO saveTicket (TicketDTO dto);
    TicketDTO updateTicket(TicketDTO dto);
    List<TicketDTO> getAllTicket();
}
