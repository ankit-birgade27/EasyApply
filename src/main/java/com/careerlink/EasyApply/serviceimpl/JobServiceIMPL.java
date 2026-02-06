package com.careerlink.EasyApply.serviceimpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.careerlink.EasyApply.dao.JobRepository;
import com.careerlink.EasyApply.entity.Job;
import com.careerlink.EasyApply.service.JobService;
@Service
public class JobServiceIMPL implements JobService {
    @Autowired
	JobRepository repo;
	@Override
	public Job addJob(String role, Job job) {
	if(!role.equals("ADMIN")) {
	 throw new RuntimeException("only admin can add job");
			  }
	Job savedJob=repo.save(job);
		return savedJob;}

	@Override
	public List<Job> getJobsAll() {
		List<Job> jobs = repo.findAll();
		return jobs;
	}
    @Override
	public Job getJobById(Long id) {
	    Job job = repo.findById(id).get();
		return job;
	}

	@Override
	public Job updateJob(String role, Long id, 
			Job job) {
		if(!role.equals("ADMIN")) {
		  throw new RuntimeException("only admin can update");
		}
		
		Job existingJob= repo.findById(id).get();
		existingJob.setCompanyName(job.getCompanyName());
		existingJob.setDescription(job.getDescription());
		existingJob.setLocation(job.getLocation());
	    Job  updatedJob= repo.save(existingJob);
		return updatedJob;
	}

	@Override
	public String deleteJob(String role, Long id) {
		if(!role.equals("ADMIN")) {
			throw new RuntimeException("only admin can delete job");
			
		}
		repo.deleteById(id);
		return  "job deleted";
	}

}
