package com.tymg.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class MessageController {

	
	public String getMessages(){
		return "message";
	}
}
