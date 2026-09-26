package com.viratech.itsm_api.customer.application;

import com.viratech.itsm_api.customer.application.dto.CustomerTicketResponse;
import com.viratech.itsm_api.customer.domain.Customer;
import com.viratech.itsm_api.customer.application.dto.CustomerRequest;
import com.viratech.itsm_api.customer.application.dto.CustomerResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CustomerMapper {

    public CustomerResponse toDto(Customer entity){

        LocalDateTime createdAt = entity.getCreatedAt() != null
                ? entity.getCreatedAt()
                : LocalDateTime.now();

        return new CustomerResponse(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getPhone(),
                createdAt
        );
    }

    public Customer toEntity(CustomerRequest request){
        return Customer.builder()
                .name(request.name())
                .email(request.email())
                .phone(request.phone())
                .build();
    }

    public CustomerTicketResponse toDtoTicketResponse(Customer entity){
         return new CustomerTicketResponse(
                entity.getId(),
                entity.getName(),
                entity.getEmail()
        );
    }
}
