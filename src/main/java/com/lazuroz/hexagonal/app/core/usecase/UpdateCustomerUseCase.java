package com.lazuroz.hexagonal.app.core.usecase;

import com.lazuroz.hexagonal.app.core.domain.Customer;
import com.lazuroz.hexagonal.app.ports.in.FindCustomerByIdInputPort;
import com.lazuroz.hexagonal.app.ports.in.UpdateCustomerInputPort;
import com.lazuroz.hexagonal.app.ports.out.FindAddressByZipCodeOutputPort;
import com.lazuroz.hexagonal.app.ports.out.UpdateCustomerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(final Customer customer, final String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
