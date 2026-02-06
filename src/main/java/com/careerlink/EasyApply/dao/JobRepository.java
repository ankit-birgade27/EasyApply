package com.careerlink.EasyApply.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.careerlink.EasyApply.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {

}
