package com.viratech.itsm_api.customer.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record CustomerRequest(

        @NotEmpty
        @Size(min = 3, max = 100)
        String name,

        @NotEmpty
        @Email
        String email,

        @NotEmpty
        String phone
) {
}
