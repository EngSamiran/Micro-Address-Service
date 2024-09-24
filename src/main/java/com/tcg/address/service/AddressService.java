package com.tcg.address.service;

import com.tcg.address.response_entity.ResponseAddress;

public interface AddressService {
	ResponseAddress getAddressById(long addId);
}
