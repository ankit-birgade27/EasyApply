package com.careerlink.EasyApply.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Job {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long jobId;
	private String companyName;
	private String description;
    private String location;
	
}
