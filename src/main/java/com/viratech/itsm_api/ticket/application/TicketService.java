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

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final CustomerRepository customerRepository;
    private final TicketMapper ticketMapper;
    private final CustomerMapper customerMapper;

    public TicketResponse createTicket(TicketRequest request){

        Customer customer = customerRepository.findById(request.customerId())
                .orElseThrow(()-> new ResourceNotFoundException("Resource Not Found"));

        Ticket ticket = ticketMapper.toEntity(request);

        ticket.setStatus(Status.OPEN);
        ticket.setCustomer(customer);

        Ticket ticketSaved = ticketRepository.save(ticket);

        return ticketMapper.toDto(ticketSaved);
    }

    public Optional<TicketResponse> findTicketById(Long id){

        Ticket ticket =  ticketRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Resource Not Found"));

        TicketResponse response = ticketMapper.toDto(ticket);

        return Optional.of(response);
    }
}
