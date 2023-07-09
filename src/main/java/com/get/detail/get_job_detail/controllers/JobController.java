package com.get.detail.get_job_detail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.detail.get_job_detail.models.entities.Job;
import com.get.detail.get_job_detail.services.JobService;

@RestController
@RequestMapping("/api/recruitment/positions")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobDetail(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if (job == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(job, HttpStatus.OK);
    }
}
