package com.careerlink.EasyApply.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careerlink.EasyApply.entity.JobApplication;

@Repository
public interface JobApplicationRepostiory  extends 
       JpaRepository<JobApplication, Long>{

}
