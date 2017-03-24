package com.cvstore.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cvstore.model.Customer;

@Repository
public interface CVStoreInterface extends MongoRepository<Customer, String>{
Customer findByUsername(String name);
}
