package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

import com.example.demo.service.CustomerService;

@RestController

public class CustomerController {

@Autowired

CustomerService service;

@PostMapping("/customer")

public String create(@RequestBody Customer customer) {

return service.addCustomer(customer);

}

@GetMapping("/customer")

public List<Customer> read(){

return service.getCustomer();

}

@GetMapping("/customer/{id}")

public Optional<Customer>readById(@PathVariable int id){

return service.getCustomerById(id);

}

@PutMapping("/customer")

public String update(@RequestBody Customer customer) {

return service.updateCustomer(customer);

}

@DeleteMapping("/customer")

public String delete(@RequestParam int id) {

return service.deleteCustomerById(id);

}

}