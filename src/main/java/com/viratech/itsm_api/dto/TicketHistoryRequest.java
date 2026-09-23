package com.viratech.itsm_api.dto;

import com.viratech.itsm_api.domain.Ticket;

public record TicketHistoryRequest(
        Ticket ticket,
        String oldStatus,
        String newStatus
) {
}
