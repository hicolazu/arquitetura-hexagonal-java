package com.lazuroz.hexagonal.app.core.usecase;

import com.lazuroz.hexagonal.app.core.domain.Customer;
import com.lazuroz.hexagonal.app.ports.in.InsertCustomerInputPort;
import com.lazuroz.hexagonal.app.ports.out.FindAddressByZipCodeOutputPort;
import com.lazuroz.hexagonal.app.ports.out.InsertCustomerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(final Customer customer,
                       final String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
