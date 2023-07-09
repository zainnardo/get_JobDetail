package com.get.detail.get_job_detail.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.get.detail.get_job_detail.models.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import  com.get.detail.get_job_detail.models.entities.Product;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product findOne(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(!product.isPresent()){
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void removeOne(Long id){
        productRepository.deleteById(id);
    }

    public List<Product> findByName(String name){
        return productRepository.findByNameContains(name);
    }
}
