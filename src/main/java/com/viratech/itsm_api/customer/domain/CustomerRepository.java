package com.viratech.itsm_api.customer.domain;

import java.util.Optional;

public interface CustomerRepository {
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long id);
    Customer save(Customer customer);
    Optional<Customer> findById(Long id);
    void delete(Customer customer);
}
