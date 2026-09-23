package com.viratech.itsm_api.dto;

import java.time.LocalDateTime;

public record TicketHistoryResponse(
        Long id,
        TicketResponse ticket,
        String oldStatus,
        String newStatus,
        LocalDateTime changeAt
) {
}
