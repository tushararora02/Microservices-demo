package com.infy.Department.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeUtils {
	@Bean (name="getMapper")
	public ModelMapper getMapper()
	{
		return new ModelMapper();
	}

}
