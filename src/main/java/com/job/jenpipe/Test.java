package com.job.jenpipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping(value = "/hello")
	String hello() {
		return "Hello from Spring boot";
	}
}
