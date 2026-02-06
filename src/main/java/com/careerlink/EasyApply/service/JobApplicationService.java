package com.careerlink.EasyApply.service;

import com.careerlink.EasyApply.entity.JobApplication;

public interface JobApplicationService {
	
	public JobApplication apply(String role,
			JobApplication application);

}
