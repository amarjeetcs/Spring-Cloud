package com.spring.amazon.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Shopping-service")
public class AmazonShoppingController {

	@Autowired
	private RestTemplate template;

	@GetMapping("/amazon-payment")
	public String invokePaymentService() {
		String url = "http://PAYMENT-SERVICE/hello";
		return "Welcome to Calling internal api using RestTemplate" + template.getForObject(url, String.class);
	}

	@GetMapping("/amazon-payment/{price}")
	public String invokePaymentService1(@PathVariable int price) {
		String url = "http://PAYMENT-SERVICE/payNow/" + price;
		return "Welcome to Calling internal api using RestTemplate" + template.getForObject(url, String.class);
	}

	@GetMapping("/DisplayName")
	public String getName() {
		return "My name is Amarjeet from shopping";
	}

}
