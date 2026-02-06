package com.careerlink.EasyApply.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.careerlink.EasyApply.dao.AuthRepository;
import com.careerlink.EasyApply.dto.Login;
import com.careerlink.EasyApply.entity.User;
import com.careerlink.EasyApply.service.AuthService;

@Service
public class AuthServiceIMPL implements 
    AuthService{
     
	@Autowired
	AuthRepository repo;
	
	@Override
	public User register(User user) {
	User saveduser=repo.save(user);
		return saveduser;
	}
     @Override
	public User login(Login login) {
	User user= repo.findByEmail(login.getEmail());
	if(user==null) {
	   throw new RuntimeException("email not exist");
	}
	  if(!user.getPassword().equals(login.getPassword())) {
		  throw new RuntimeException("password is incorrect");
	  }
	    return user;
	}



}
