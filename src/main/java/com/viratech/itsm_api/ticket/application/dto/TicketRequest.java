package com.viratech.itsm_api.ticket.application.dto;

import com.viratech.itsm_api.enums.Category;
import com.viratech.itsm_api.enums.Priority;
import com.viratech.itsm_api.enums.Status;

public record TicketRequest(
        String title,
        String description,
        Status status,
        Priority priority,
        Category category,
        Long customerId
) {
}
