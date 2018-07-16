package com.employee.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.employee.signup.dao.SignUpJpaDao;
import com.employee.signup.dto.UserDto;
import com.employee.signup.model.User;

@Service("signUpService")
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private SignUpJpaDao signUpJpaDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public ResponseEntity<Void> createUser(UserDto userDto) {
		User user = new User();
		user.setUserFirstName(userDto.getUserFirstName());
		user.setUserLastName(userDto.getUserLastName());
		user.setUserPassword(passwordEncoder.encode(userDto.getUserPassword()));
		user.setUserAddress(userDto.getUserAddress());
		user.setUserEmail(userDto.getUserEmail());
		user.setUserDob(userDto.getUserDob());
		user.setUserPincode(userDto.getUserPincode());
		user.setUserPhone(userDto.getUserPhone());
		user.setUserRole("2");
		if(signUpJpaDao.save(user)!=null) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
}
