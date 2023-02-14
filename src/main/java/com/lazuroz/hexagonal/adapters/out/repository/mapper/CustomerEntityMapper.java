package com.lazuroz.hexagonal.adapters.out.repository.mapper;

import com.lazuroz.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.lazuroz.hexagonal.app.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
