package com.lazuroz.hexagonal.app.ports.in;

import com.lazuroz.hexagonal.app.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
