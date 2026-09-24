package com.viratech.itsm_api.service;

import com.viratech.itsm_api.domain.Customer;
import com.viratech.itsm_api.dto.CustomerRequest;
import com.viratech.itsm_api.dto.CustomerResponse;
import com.viratech.itsm_api.mapper.CustomerMapper;
import com.viratech.itsm_api.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    public CustomerResponse createCustomer(CustomerRequest request){

        boolean emailExiste = repository.existsByEmail(request.email());
        //TODO criar exceção de conflito
        if(emailExiste)throw new RuntimeException("This Email is Already registered");

        Customer customer = repository.save(mapper.toEntity(request));

        return mapper.toDto(customer);
    }

    //listar por id
    public CustomerResponse findById(Long id){
        Customer customer = find(id);
        return mapper.toDto(customer);
    }

    //listar todos com paginação

    //update
    @Transactional
    public CustomerResponse update(CustomerRequest request, Long id){
        Customer customer = find(id);

        boolean existeEmail = repository.existsByEmailAndIdNot(request.email(), id);
        if(existeEmail)throw new RuntimeException("This Email is Already registered");

        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setPhone(request.phone());

        return mapper.toDto(customer);

    }

    //deletar
    void delete(Long id){
        Customer customerDeleted = find(id);
        repository.delete(customerDeleted);
    }

    private Customer find(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Resource Not Found"));
    }


}
