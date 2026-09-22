package com.viratech.itsm_api.dto;

public record CustomerRequest(
        String name,
        String email,
        String phone
) {
}
