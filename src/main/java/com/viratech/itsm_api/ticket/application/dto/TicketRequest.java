package com.viratech.itsm_api.ticket.application.dto;

import com.viratech.itsm_api.customer.application.dto.CustomerRequest;

public record TicketRequest(
        String title,
        String description,
        String status,
        String priority,
        String category,
        CustomerRequest customerRequest
) {
}
