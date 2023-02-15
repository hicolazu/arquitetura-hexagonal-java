package com.lazuroz.hexagonal.app.core.usecase;

import com.lazuroz.hexagonal.app.core.domain.Customer;
import com.lazuroz.hexagonal.app.ports.in.FindCustomerByIdInputPort;
import com.lazuroz.hexagonal.app.ports.out.FindCustomerByIdOutputPort;
import org.springframework.stereotype.Component;

@Component
public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(final String id) {
        return findCustomerByIdOutputPort
                .find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
