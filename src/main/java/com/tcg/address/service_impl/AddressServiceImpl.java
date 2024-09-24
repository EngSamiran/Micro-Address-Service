package com.tcg.address.service_impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcg.address.custome_exception.ResourceNotFoundException;
import com.tcg.address.entity.Address;
import com.tcg.address.repository.AddressRepo;
import com.tcg.address.response_entity.ResponseAddress;
import com.tcg.address.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepo addressRepo;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public ResponseAddress getAddressById(long addId) {
		System.out.println("address service called by id ="+ addId);
		Optional<Address> optional = addressRepo.findById(addId);
		if(optional.isPresent()) {
			return modelMapper.map(optional.get(), ResponseAddress.class);
		}
		throw new ResourceNotFoundException("Your provided address id : "+ addId+ " not founded, check id and try again..");
	}

}
