package com.career.spring.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.career.spring.dao.LoginDao;
import com.career.spring.model.Login;


public class LoginServiceImpl implements LoginService{

	  @Autowired
	  public LoginDao userDao;

	  public int register(Login user) {
	    return userDao.register(user);
	  }

	  public Login validateUser(Login login) {
	    return userDao.validateUser(login);
	  }
}
