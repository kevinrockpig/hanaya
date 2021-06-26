package com.hanaya.front;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanaya.service.ProductService;

@Controller
@RequestMapping(name = "pdController")
public class productController {
	
	@Autowired
	private  ProductService productService; 
	
	   @RequestMapping("/productInfo")
	   public String toPdInfo(Model model){
			List<Map<String,Object>> pd_list = productService.getPdList();
			model.addAttribute("pd_list", pd_list);
	       return "product/product";
	  }
	   
}
