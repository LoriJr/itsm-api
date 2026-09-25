package com.viratech.itsm_api.customer.domain;

public interface CustomerRepository {
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long id);
}
