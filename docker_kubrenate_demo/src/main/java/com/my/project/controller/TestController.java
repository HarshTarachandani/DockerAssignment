package com.my.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TestController {
	@GetMapping(
			path = "/get-info",
			produces = "application/json")
		public String getInfo()
		{
			return "Info api working.";
		}
}
