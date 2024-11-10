package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerCongtroller {

	@Autowired
	Feign feign;

	@GetMapping("/add/{item_id}") 
	public String addCustomersItem(@PathVariable("item_id")String item_id) {
		feign.addToCart(item_id);
		return "Item with id: "+item_id+" Selected to add in cart";
	}
}
