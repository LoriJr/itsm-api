package com.viratech.itsm_api.customer.infrastructure;

import com.viratech.itsm_api.customer.domain.CustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository {

    private final SpringDataCustomerRepository repository;

    @Override
    public boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }

    @Override
    public boolean existsByEmailAndIdNot(String email, Long id) {
        return repository.existsByEmailAndIdNot(email, id);
    }
}
