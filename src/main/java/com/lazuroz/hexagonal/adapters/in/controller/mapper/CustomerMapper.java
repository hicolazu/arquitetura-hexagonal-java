package com.lazuroz.hexagonal.adapters.in.controller.mapper;

import com.lazuroz.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.lazuroz.hexagonal.app.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}
