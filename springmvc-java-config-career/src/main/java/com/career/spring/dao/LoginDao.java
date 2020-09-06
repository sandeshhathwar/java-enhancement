package com.career.spring.dao;

import com.career.spring.model.Login;


public interface LoginDao {

	 int register(Login login);

	 Login validateUser(Login login);
}
