package com.tcg.address.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Address")
@Entity(name = "Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AddressIdGenerator")
	@SequenceGenerator(name = "AddressIdGenerator", initialValue = 100, allocationSize = 1, sequenceName = "AddressId_seq")
	@Column(name = "addressId", nullable = false)
	private long addressId;

	@Column(name = "city", length = 100, nullable = false)
	private String city;

	@Column(name = "locality", length = 200, nullable = false)
	private String locality;

	@Column(name = "landMark", length = 300, nullable = false)
	private String landMark;

	@Column(name = "pin", length = 10, nullable = false)
	private String pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(long addressId, String city, String locality, String landMark, String pin) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.locality = locality;
		this.landMark = landMark;
		this.pin = pin;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	
	
}
