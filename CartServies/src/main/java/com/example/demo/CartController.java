package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@GetMapping("/addToCart/{item_id}") 
    public String addToCart(@PathVariable("item_id") String item_id) 
    { 
        return "Item with id : " + item_id+ "added to cart"; 
    }
}
