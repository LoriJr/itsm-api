package com.viratech.itsm_api.ticket.domain;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketRepository {
    Ticket save(Ticket customer);
    Optional<Ticket> findById(Long id);
}
