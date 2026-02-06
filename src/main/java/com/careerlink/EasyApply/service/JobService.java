package com.careerlink.EasyApply.service;

import java.util.List;

import com.careerlink.EasyApply.entity.Job;

public interface JobService {
	
	
	public Job addJob(String role, Job job);
	
	public List<Job> getJobsAll();
	
	public Job  getJobById(Long id);
	
	public Job  updateJob(String role,Long id,Job job);
	
	public String deleteJob(String role,Long id);

}
