package com.viratech.itsm_api.ticket.application.dto;

import com.viratech.itsm_api.enums.Category;
import com.viratech.itsm_api.enums.Priority;

public record TicketRequest(
        String title,
        String description,
        Priority priority,
        Category category,
        Long customerId
) {
}
