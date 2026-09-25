package com.viratech.itsm_api.tickethistory.application.dto;

import com.viratech.itsm_api.ticket.application.dto.TicketResponse;

import java.time.LocalDateTime;

public record TicketHistoryResponse(
        Long id,
        TicketResponse ticket,
        String oldStatus,
        String newStatus,
        LocalDateTime changeAt
) {
}
