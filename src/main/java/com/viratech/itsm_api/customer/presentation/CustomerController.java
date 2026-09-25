package com.viratech.itsm_api.customer.presentation;

import com.viratech.itsm_api.customer.application.CustomerService;
import com.viratech.itsm_api.customer.application.dto.CustomerRequest;
import com.viratech.itsm_api.customer.application.dto.CustomerResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    public ResponseEntity<CustomerResponse> saveCustomer(@Valid @RequestBody CustomerRequest request){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.createCustomer(request));
    }


}
