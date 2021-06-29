package com.example.services1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	private RestTemplate Items;
	
	@GetMapping("/service1")
	public RestTemplate getservices() {
		return Items;
		
		
		@PostMapping("/services2")
		
		String url ="http;//8080/services2/items";
		Object objects = Items.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}
	

}
