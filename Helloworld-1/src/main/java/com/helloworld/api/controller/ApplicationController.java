package com.helloworld.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	@RequestMapping("/hi")
	public String welcome() {
		return "hi konnectgen family";
		
	}

}
