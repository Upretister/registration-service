package com.employee.signup.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.signup.model.User;

@Repository("signUpJpaDao")
public interface SignUpJpaDao extends CrudRepository<User, Long> {

}
