package com.lazuroz.hexagonal.app.ports.in;

import com.lazuroz.hexagonal.app.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
