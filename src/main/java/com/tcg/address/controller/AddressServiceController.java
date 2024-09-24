package com.tcg.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tcg.address.response_entity.ResponseAddress;
import com.tcg.address.service.AddressService;

@RestController
public class AddressServiceController {
	@Autowired
	private AddressService addressService;

	@GetMapping(path = "address/{id}")
	public ResponseEntity<ResponseAddress> getAddressById(@PathVariable(name = "id") long id) {
		ResponseAddress responseAddress = addressService.getAddressById(id);
		return ResponseEntity.status(HttpStatus.OK).body(responseAddress);

	}
}
