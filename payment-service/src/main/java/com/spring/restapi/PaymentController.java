package com.spring.restapi;

import java.util.HashMap;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import jakarta.websocket.server.PathParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/Payment-service")
public class PaymentController {
	@Autowired
	private RestTemplate template;

	// PatVariable practical
	@GetMapping("/getName/{name}")
	public String getName(@PathVariable String name) {
		return "your name is"+name;
	}

	//RequestParam practical
	@GetMapping("/getAge")
	public String getAge(@RequestParam int id, @RequestParam String name) {
	    return "Your id is " + id + ", and your name is " + name;
	}
	

	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price)
	{
		return "Payment with INR "+ price  +" is successfull";
		
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World Amarjeet from Payment Controller";
	}
	

	
	
	@GetMapping("/callingFromPaymentToAmazonShopping")
	public String invokePaymentService()
	{
		String url="http://AMAZON-SHOPPING-SERVICE/DisplayName";
		return "Welcome to Calling internal api using RestTemplate" + template.getForObject(url, String.class);
	}
	
	
	
	
	


}