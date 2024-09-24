package com.tcg.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcg.address.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

}
