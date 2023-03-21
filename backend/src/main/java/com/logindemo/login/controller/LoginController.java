package com.logindemo.login.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logindemo.login.payload.LoginPayload;
import com.logindemo.login.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private ResourceBundleMessageSource source;
	
	
	@PostMapping
	public ResponseEntity<LoginPayload> login(@RequestBody LoginPayload login){
		LoginPayload loginresponse = loginService.login(login);
		if(loginresponse.getUsername()!=null)
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(loginresponse);
		else
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(loginresponse);
	}
	
	
	@GetMapping
	public String getLocalMessage( @RequestHeader(name = "Accept-Language", required = false) final Locale locale) {
		return source.getMessage("welcome.message",null, LocaleContextHolder.getLocale());
		
	}
	

}
