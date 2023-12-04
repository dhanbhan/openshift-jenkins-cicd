package com.portal.openshiftjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/newpath")
	public String ping() {
		return "Set new path for app root - Dhananjay";
	}
}
