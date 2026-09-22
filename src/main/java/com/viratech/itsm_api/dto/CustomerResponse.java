package com.viratech.itsm_api.dto;

import java.time.LocalDateTime;

public record CustomerResponse(
        Long id,
        String name,
        String email,
        String phone,
        LocalDateTime createdAt
) {
}
