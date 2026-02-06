package com.careerlink.EasyApply.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerlink.EasyApply.dao.JobApplicationRepostiory;
import com.careerlink.EasyApply.entity.JobApplication;
import com.careerlink.EasyApply.service.JobApplicationService;

@Service
public class JobApplicationServiceIMPL implements 
    JobApplicationService {
     
	@Autowired
	JobApplicationRepostiory repo; 
	
	@Override
	public JobApplication apply(String role, 
			JobApplication application) {
		if( !role.equals("USER")) {
			throw new  RuntimeException("only user can apply");}
		JobApplication jobapplication 
		= repo.save(application);
		
		return jobapplication ;
	}

}
