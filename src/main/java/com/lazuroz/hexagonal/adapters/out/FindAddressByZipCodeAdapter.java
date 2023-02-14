package com.lazuroz.hexagonal.adapters.out;

import com.lazuroz.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.lazuroz.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.lazuroz.hexagonal.app.core.domain.Address;
import com.lazuroz.hexagonal.app.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(final String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toDomain(addressResponse);
    }
}
