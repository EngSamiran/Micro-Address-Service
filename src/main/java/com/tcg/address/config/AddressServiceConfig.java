package com.tcg.address.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressServiceConfig {
	@Bean
	ModelMapper modelMapperBeanCreate() {
		return new ModelMapper();
	}
}
