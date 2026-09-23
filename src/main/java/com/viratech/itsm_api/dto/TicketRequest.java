package com.viratech.itsm_api.dto;

public record TicketRequest(
        String title,
        String description,
        String status,
        String priority,
        String category,
        CustomerRequest customerRequest
) {
}
