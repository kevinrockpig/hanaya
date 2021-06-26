package com.hanaya.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/LoginController")
public class LoginController {
	
   //真實訪問地址 : 專案名/LoginController/login
   @RequestMapping("/login")
   public String toLogin(Model model){
       //向模型中新增屬性msg與值，可以在JSP頁面中取出並渲染
       model.addAttribute("msg","hello world");
       //web-inf/front/login.jsp
       return "login";
  }
 
   
}