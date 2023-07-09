package com.get.detail.get_job_detail.services;

import com.get.detail.get_job_detail.models.entities.Job;
import com.get.detail.get_job_detail.models.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }
}
