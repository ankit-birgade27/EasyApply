package com.careerlink.EasyApply.service;

import com.careerlink.EasyApply.dto.Login;
import com.careerlink.EasyApply.entity.User;

public interface AuthService {
	public  User register(User user);
	public  User login(Login login);
	

}
