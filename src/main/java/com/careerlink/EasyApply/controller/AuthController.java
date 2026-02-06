package com.careerlink.EasyApply.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerlink.EasyApply.dto.Login;
import com.careerlink.EasyApply.entity.User;
import com.careerlink.EasyApply.serviceimpl.AuthServiceIMPL;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:5173/")
public class AuthController {
	@Autowired
	AuthServiceIMPL service;
	

	@PostMapping("/saved")
	public ResponseEntity<User> register(@RequestBody User user) {
	User savedUser=	service.register(user);
	return  ResponseEntity.status(HttpStatus.OK).body(savedUser);
		}
	
	@PostMapping("/login")
public ResponseEntity<?> login( @RequestBody Login login) {
		
		try {
			User loggeduser=service.login(login);
			return ResponseEntity.status(HttpStatus.OK)
					.body(loggeduser);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
					.body("invalid email or password");
		}

	}

}
