package com.learn.youtube.devnitro.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {

	@GetMapping(path = "/h")
	public String home() {
		return "Hai Deepan!";
	}

}
