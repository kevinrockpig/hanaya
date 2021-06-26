package com.hanaya.front;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanaya.model.Product;
import com.hanaya.service.ProductService;

@Controller
public class IndexController {
	
	@Autowired
	private ProductService productService;
	

	@RequestMapping("/")
	public String toIndex(Model model) {
	
//		Product pd = productService.getPdById(1);
//		model.addAttribute("product", pd);
//		Map<String, Object> pd = productService.getPdMap(1);
//		model.addAttribute("product", pd);
//		System.out.println("pd = "+ pd);
		
		List<Map<String,Object>> pd_list = productService.getPdList();
//        for (Map map : pd_list) {
//        	System.out.println(map.get("0"));
//        }
		model.addAttribute("pd_list", pd_list);
		return "index";
	}
	

}
