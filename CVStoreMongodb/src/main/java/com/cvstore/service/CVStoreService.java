package com.cvstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvstore.model.Customer;
import com.cvstore.repo.CVStoreInterface;

@Service
public class CVStoreService {

	@Autowired
	private CVStoreInterface cvstoreinterface;
	
	public Customer findMyCV(){
		return cvstoreinterface.findByUsername("rajat maharjan");
	}
	
	public String addCustomer(Customer customer){
		cvstoreinterface.save(customer);
		return "greeting";
	}
}
