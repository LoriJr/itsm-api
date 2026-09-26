package com.viratech.itsm_api.ticket.domain;

import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository {
    Ticket save(Ticket customer);
}
