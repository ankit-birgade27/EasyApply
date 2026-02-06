package com.careerlink.EasyApply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerlink.EasyApply.entity.Job;
import com.careerlink.EasyApply.serviceimpl.JobServiceIMPL;

@RestController
@RequestMapping("/jobs")
@CrossOrigin("http://localhost:5173/")
public class JobController {
	@Autowired
	JobServiceIMPL service;
	
	@PostMapping("/saved")
public Job  savedJob( @RequestHeader("role") String role,
		@RequestBody Job job) {
		Job savedJob=service.addJob(role, job);
		System.out.println(savedJob);
	return savedJob;}
	
	@GetMapping("/all")
	public List<Job> getJobsAll() {
		List<Job> jobs = service.getJobsAll();
		return jobs;}
   
	@GetMapping("/byId/{id}")
	public Job getJobById(@PathVariable Long id) {
	 Job job= service.getJobById(id);
		return job;
	}
	
	@PutMapping("/edit/{id}")
	public Job updateJob( @RequestHeader String role,
		@PathVariable Long id, @RequestBody Job job) {
		
	  Job  updatedJob= service.updateJob(role, id, job);
		return updatedJob;
	}
  
	@DeleteMapping("/remove/{id}")
	public String deleteJob(@RequestHeader("role") String role,@PathVariable Long id) {
	String msg=	service.deleteJob(role, id);
		return  msg;
	}
}
