package com.viratech.itsm_api.ticket.infrastructure;

import com.viratech.itsm_api.ticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataTicketRepository extends JpaRepository<Ticket, Long>{

}
