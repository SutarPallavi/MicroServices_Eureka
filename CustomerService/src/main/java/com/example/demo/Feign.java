package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CartServies")
public interface Feign {

	@GetMapping("/addToCart/{item_id}")
	public String addToCart(@PathVariable("item_id")String item_id);
}
