package com.hanaya.front;


import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/lineBot")
public class LineBotController {
	
//	private String LINE_SECRET = "484e909218887a9241d91d906983a7ff";
	
	@RequestMapping(value="/callbak")
	public String lineBotCallback(@RequestBody(required=false) String requestBody) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
		
		String channelSecret = "484e909218887a9241d91d906983a7ff"; // Channel secret string
		String httpRequestBody = requestBody; // Request body string
		SecretKeySpec key = new SecretKeySpec(channelSecret.getBytes(), "HmacSHA256");
		Mac mac = Mac.getInstance("HmacSHA256");
		mac.init(key);
		if(httpRequestBody!=null) {
					byte[] source = httpRequestBody.getBytes("UTF-8");
					String signature = Base64.encodeBase64String(mac.doFinal(source));
					// Compare x-line-signature request header string and the signature	
					System.out.println("requestBody : "+signature);	
		}

		
		return "/lineBot/lineBot";
	}
	
}
