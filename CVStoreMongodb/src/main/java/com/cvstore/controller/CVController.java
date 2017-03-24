package com.cvstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cvstore.model.Customer;
import com.cvstore.service.CVStoreService;

@Controller
public class CVController {
//	@Autowired
//	private CustomerService customerservice;

	@Autowired
	private CVStoreService cvstoreservice;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String welcomePage(){
		return "greeting";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addCustomer(){
	return "add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addCust(@ModelAttribute("addform") Customer customer){
		cvstoreservice.addCustomer(customer);
		return "redirect:/";
	}
	
	@RequestMapping(value="/showmycv",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Customer showcv(Model model){
		Customer cust=cvstoreservice.findMyCV();
		model.addAttribute("customer",cust);
		return cust;
	}
}
