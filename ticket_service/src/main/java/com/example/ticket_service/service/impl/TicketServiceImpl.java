package com.example.ticket_service.service.impl;

import com.example.ticket_service.dto.TicketDTO;
import com.example.ticket_service.entity.Ticket;
import com.example.ticket_service.repo.TicketRepo;
import com.example.ticket_service.service.TicketService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public TicketDTO saveTicket(TicketDTO dto) {
        if (repo.existsById(dto.getId())){
            new RuntimeException("all ready exits");
        }
        return mapper.map(repo.save(mapper.map(dto, Ticket.class)),TicketDTO.class);
    }

    @Override
    public TicketDTO updateTicket(TicketDTO dto) {
        if (repo.existsById(dto.getId())){
            new RuntimeException("all ready exits");
        }
        return mapper.map(repo.save(mapper.map(dto, Ticket.class)),TicketDTO.class);
    }

    @Override
    public List<TicketDTO> getAllTicket() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<TicketDTO>>() {
        }.getType());
    }
}
