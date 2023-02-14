package com.lazuroz.hexagonal.app.ports.out;

import com.lazuroz.hexagonal.app.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(final Customer customer);
}
