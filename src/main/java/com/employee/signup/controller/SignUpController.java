package com.employee.signup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.signup.dto.UserDto;
import com.employee.signup.service.SignUpService;

@RestController
@RequestMapping("api/v1")
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	
	@RequestMapping(value="signup",produces=MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@Valid @RequestBody UserDto userDto){
		System.out.println("COntroller#####");
		System.err.println("Working :: "+userDto.getUserFirstName());
		return signUpService.createUser(userDto);
	}
}
