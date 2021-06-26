package com.hanaya.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "pdController")
public class productController {
	
	   @RequestMapping("/pdInfo")
	   public String toPdInfo(Model model){

	       return "product";
	  }
	   
}
