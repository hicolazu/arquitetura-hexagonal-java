package com.lazuroz.hexagonal.adapters.out;

import com.lazuroz.hexagonal.adapters.out.repository.CustomerRepository;
import com.lazuroz.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.lazuroz.hexagonal.app.core.domain.Customer;
import com.lazuroz.hexagonal.app.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
