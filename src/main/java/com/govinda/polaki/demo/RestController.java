package com.govinda.polaki.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/hello")
	public String getMsg() {
		return "Hellow world";
	}
}
