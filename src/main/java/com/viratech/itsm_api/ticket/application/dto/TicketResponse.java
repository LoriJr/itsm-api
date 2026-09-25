package com.viratech.itsm_api.ticket.application.dto;

import com.viratech.itsm_api.customer.application.dto.CustomerResponse;
import com.viratech.itsm_api.enums.Category;
import com.viratech.itsm_api.enums.Priority;
import com.viratech.itsm_api.enums.Status;

import java.time.LocalDateTime;

public record TicketResponse(
        Long id,
        String title,
        String description,
        Status status,
        Priority priority,
        Category category,
        CustomerResponse customerResponse,
        LocalDateTime createdAt,
        LocalDateTime updateAt
) {
}
