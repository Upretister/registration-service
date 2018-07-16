
package com.employee.signup.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class UserDto {
	
	
	private int userId;
	
	@NotNull
	@NotEmpty
	private String userFirstName;
	
	@NotNull
	@NotEmpty
	private String userLastName;
	
	@NotNull
	@NotEmpty
	private String userEmail;
	
	@NotNull
	@NotEmpty
	private String userPassword;
	
	
	private String userAddress;
	
	
	private String userPincode;
	
	
	private String userPhone;
	
	
	private String userRole;
	
	
	private Date userDob;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPincode() {
		return userPincode;
	}
	public void setUserPincode(String userPincode) {
		this.userPincode = userPincode;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Date getUserDob() {
		return userDob;
	}
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

}
