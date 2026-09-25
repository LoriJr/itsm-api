package com.viratech.itsm_api.customer.application.dto;

import java.time.LocalDateTime;

public record CustomerResponse(
        Long id,
        String name,
        String email,
        String phone,
        LocalDateTime createdAt
) {
}
