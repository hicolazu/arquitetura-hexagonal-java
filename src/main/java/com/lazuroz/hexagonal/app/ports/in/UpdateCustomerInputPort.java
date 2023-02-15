package com.lazuroz.hexagonal.app.ports.in;

import com.lazuroz.hexagonal.app.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
