package com.viratech.itsm_api.tickethistory.application.dto;

import com.viratech.itsm_api.ticket.domain.Ticket;

public record TicketHistoryRequest(
        Ticket ticket,
        String oldStatus,
        String newStatus
) {
}
