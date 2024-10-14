package com.hamza.microservices.Product.repository;


import com.hamza.microservices.Product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


}
