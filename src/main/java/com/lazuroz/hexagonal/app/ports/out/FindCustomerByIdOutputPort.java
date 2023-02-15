package com.lazuroz.hexagonal.app.ports.out;

import com.lazuroz.hexagonal.app.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(final String id);
}
