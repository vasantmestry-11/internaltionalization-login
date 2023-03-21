package com.logindemo.login.service.impl;

import org.springframework.stereotype.Service;

import com.logindemo.login.payload.LoginPayload;
import com.logindemo.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Override
	public LoginPayload login(LoginPayload login) {
		String username  = login.getUsername();
		String password = login.getPassword();
		if(username.equals("admin") && password.equals("admin"))
			return login;
		else
			return new LoginPayload();
	}

}
