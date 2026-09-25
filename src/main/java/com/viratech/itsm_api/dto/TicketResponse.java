package com.viratech.itsm_api.dto;

import com.viratech.itsm_api.customer.application.dto.CustomerResponse;

import java.time.LocalDateTime;

public record TicketResponse(
        Long id,
        String title,
        String description,
        String status,
        String priority,
        String category,
        CustomerResponse customerResponse,
        LocalDateTime createdAt,
        LocalDateTime updateAt
) {
}
