package com.lazuroz.hexagonal.app.ports.out;

import com.lazuroz.hexagonal.app.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(final Customer customer);
}
