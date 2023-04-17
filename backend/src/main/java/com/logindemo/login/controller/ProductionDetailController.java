package com.logindemo.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logindemo.login.payload.ProductionDetailPayload;

@RestController
@RequestMapping("/production")
public class ProductionDetailController {
	
	@PostMapping("/details")
	public ResponseEntity<?> getProductionDetails(@RequestBody ProductionDetailPayload productionDetailPayload){
		//TODO return the values required for production detail.
		return null;
		
	}

}
