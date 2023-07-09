package com.get.detail.get_job_detail.models.repository;

import com.get.detail.get_job_detail.models.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


    List<Product> findByNameContains(String name);
}
