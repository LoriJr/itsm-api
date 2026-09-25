package com.viratech.itsm_api.ticket.application;

import com.viratech.itsm_api.customer.application.CustomerMapper;
import com.viratech.itsm_api.customer.domain.Customer;
import com.viratech.itsm_api.customer.domain.CustomerRepository;
import com.viratech.itsm_api.enums.Status;
import com.viratech.itsm_api.exceptions.ResourceNotFoundException;
import com.viratech.itsm_api.ticket.application.dto.TicketRequest;
import com.viratech.itsm_api.ticket.application.dto.TicketResponse;
import com.viratech.itsm_api.ticket.domain.Ticket;
import com.viratech.itsm_api.ticket.domain.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final CustomerRepository customerRepository;
    private final TicketMapper ticketMapper;
    private final CustomerMapper customerMapper;

    public TicketResponse createTicket(TicketRequest request){

        Ticket ticket = ticketRepository.save(ticketMapper.toEntity(request));

        customerRepository.findById(request.customerId())
                .orElseThrow(()-> new ResourceNotFoundException("Resource Not Found"));

        ticket.setStatus(Status.OPEN);

        return ticketMapper.toDto(ticket);
    }




}
