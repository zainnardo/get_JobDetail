package com.get.detail.get_job_detail.models.repository;

import com.get.detail.get_job_detail.models.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
