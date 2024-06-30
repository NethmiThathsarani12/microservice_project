package com.example.ticket_service.controller;


import com.example.ticket_service.dto.TicketDTO;
import com.example.ticket_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService service;

    @GetMapping
    public List<TicketDTO> getAllTicket(){
        return service.getAllTicket();
    }

    @PostMapping
    public TicketDTO saveTicket(@RequestBody TicketDTO dto){
        return service.saveTicket(dto);
    }

    @PutMapping
    public TicketDTO updateTicket(@RequestBody TicketDTO dto){
        return service.updateTicket(dto);
    }
}
