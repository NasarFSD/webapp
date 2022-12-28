package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //stereo type annotations of our @component

public class HelloController {
	
	//adding the request mapping---->URL
	
	@RequestMapping("/Hello")
	
	public String giveHelloMessage() {
		
		return "Hello";
	}

}
