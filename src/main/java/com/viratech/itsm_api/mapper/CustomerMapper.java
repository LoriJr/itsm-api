package com.viratech.itsm_api.mapper;

import com.viratech.itsm_api.domain.Customer;
import com.viratech.itsm_api.dto.CustomerRequest;
import com.viratech.itsm_api.dto.CustomerResponse;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerResponse toDto(Customer entity){
        return new CustomerResponse(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getCreatedAt()
        );
    }

    public Customer toEntity(CustomerRequest request){
        return Customer.builder()
                .name(request.name())
                .email(request.email())
                .phone(request.phone())
                .build();
    }
}
