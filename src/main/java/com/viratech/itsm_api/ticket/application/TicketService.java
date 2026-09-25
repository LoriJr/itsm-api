package com.viratech.itsm_api.ticket.application;

import com.viratech.itsm_api.ticket.domain.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository repository;
    private final TicketMapper mapper;




}
