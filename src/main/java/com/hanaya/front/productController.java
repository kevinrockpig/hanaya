package com.hanaya.front;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hanaya.service.ProductService;

@Controller
@RequestMapping("/prods")
public class productController {
	
	@Autowired
	private	ProductService productService; 
	
	   @RequestMapping("/prodList")
	   public String toPdList(Model model){
			List<Map<String,Object>> pd_list = productService.getPdList();
			model.addAttribute("pd_list", pd_list);
	       return "/product/prodList";
	   }

	   @RequestMapping("/prodDetail/{prod_id}")
	   public String toPdDetail(Model model,@PathVariable("prod_id") Integer prod_id) {
		   List<Map<String,Object>> pd_info = productService.getPdInfoById(prod_id);
		   model.addAttribute("pd_info", pd_info);
//		   System.out.println("pd_info = "+pd_info);
		   return "/product/prodDetail";
	   }
	  
	   
}
