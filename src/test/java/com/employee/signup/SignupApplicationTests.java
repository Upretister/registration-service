package com.employee.signup;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.signup.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SignupApplicationTests {

	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();
	
	@Test
	public void contextLoads() {
	}

/*	@Test
	public void createUser() {

		UserDto user = new UserDto();
		user.setUserFirstName("Test");
		user.setUserLastName("Test");
		user.setUserEmail("test");
		user.setUserPassword("Dummy");

		HttpEntity<UserDto> entity = new HttpEntity<UserDto>(user, headers);

		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8081/api/v1/signup",HttpMethod.POST, entity, String.class);

		String actual = response.getHeaders().get(HttpHeaders.LOCATION).get(0);

		assertTrue(actual.contains("/api/v1/signup"));

	}*/
	
}
