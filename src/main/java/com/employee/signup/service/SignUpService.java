package com.employee.signup.service;

import org.springframework.http.ResponseEntity;

import com.employee.signup.dto.UserDto;

public interface SignUpService {

	ResponseEntity<Void> createUser(UserDto userDto);

}
