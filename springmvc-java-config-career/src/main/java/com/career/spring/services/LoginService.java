package com.career.spring.services;

import com.career.spring.model.Login;


public interface LoginService {

	  int register(Login user);

	  Login validateUser(Login login);
}
