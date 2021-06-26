package com.hanaya.front;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanaya.service.ProductService;

@Controller
public class IndexController {
	
	@Autowired
	private ProductService productService;
	

	@RequestMapping("/")
	public String toIndex(Model model) {
	
		model.addAttribute("hanaya_index", "hanaya_index");
		return "index";
	}
	

}
