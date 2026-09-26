package com.viratech.itsm_api.customer.application.dto;

public record CustomerTicketResponse(
        Long id,
        String name,
        String email
) {
}
