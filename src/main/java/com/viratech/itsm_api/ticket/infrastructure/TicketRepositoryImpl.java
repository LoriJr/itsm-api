package com.viratech.itsm_api.ticket.infrastructure;

import com.viratech.itsm_api.ticket.domain.Ticket;
import com.viratech.itsm_api.ticket.domain.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TicketRepositoryImpl implements TicketRepository {

    private final SpringDataTicketRepository repository;

    @Override
    public Ticket save(Ticket customer) {
        return repository.save(customer);
    }
}
