package com.capgemini.bankapplicationsb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bankapplicationsb.exceptions.AccountNotFoundException;
import com.capgemini.bankapplicationsb.model.Customer;
import com.capgemini.bankapplicationsb.service.CustomerService;

@Controller
public class BankAppCustomerController {
	@Autowired
	private CustomerService custService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "loginForm";
	}
	
	
	
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	public String authenticate(@ModelAttribute Customer customer,HttpSession session,Model model)  {
		
		if(custService.authenticate(customer)!=null) {
			session.setAttribute("customer", custService.authenticate(customer));
			return "homepage";
		}
		else
			return "index";		
	}
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value="/updateProfilePage",method=RequestMethod.GET)
	public String updateProfilePage(HttpSession session,Model model) {
		model.addAttribute("customer",session.getAttribute("customer"));
		return "updateEmployeeForm";
	}
	
	@RequestMapping(value="/updateProfile",method=RequestMethod.POST)
	public String updateProfile(@ModelAttribute Customer customer) {
		custService.updateProfile(customer);
		return "homepage";
	}
	
	@RequestMapping(value="/updatePassword",method=RequestMethod.GET)
	public String updatePasswordPage(HttpSession session,Model model) {
		//model.addAttribute("customer",session.getAttribute("customer"));
		return "changePasswordForm";
		
	}
	
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public String getUpdatePassword(HttpSession session,@RequestParam("newPassword") String newPassword,@RequestParam("oldPassword") String oldPassword) {
		Customer customer=(Customer) session.getAttribute("customer") ;
		if(!custService.updatePassword(customer, newPassword, oldPassword))
		 {
			 return "/updatePasswordError" ;
		 }
		 else
		 {
			 customer.setPassword(newPassword);
			 session.setAttribute("customer", customer);
			 return "homepage" ;
		 }
	}
	
	
}
