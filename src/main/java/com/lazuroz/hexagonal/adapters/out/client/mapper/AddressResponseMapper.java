package com.lazuroz.hexagonal.adapters.out.client.mapper;

import com.lazuroz.hexagonal.adapters.out.client.response.AddressResponse;
import com.lazuroz.hexagonal.app.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toDomain(final AddressResponse addressResponse);
}

