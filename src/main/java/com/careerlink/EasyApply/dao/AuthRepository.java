package com.careerlink.EasyApply.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careerlink.EasyApply.entity.User;

@Repository
public interface AuthRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	
	
	
}
