package com.lazuroz.hexagonal.app.ports.out;

import com.lazuroz.hexagonal.app.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(final String zipCode);
}
