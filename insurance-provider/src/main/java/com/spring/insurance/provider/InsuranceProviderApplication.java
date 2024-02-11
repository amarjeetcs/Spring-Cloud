package com.spring.insurance.provider;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.el.stream.Stream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-service")
public class InsuranceProviderApplication {

	@GetMapping("/getAllUpdatedPlans")
	public List<String> getPlans() {
		return java.util.stream.Stream.of("Premium", "Gold", "Platinium").collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProviderApplication.class, args);
	}

}
