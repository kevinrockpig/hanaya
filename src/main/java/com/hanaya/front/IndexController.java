package com.hanaya.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	public String toIndex() {
		System.out.println("this is index");
		return "index";
	}
}
