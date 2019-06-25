package com.beetoffice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

	@RequestMapping("/jsp")
	public String asdf() {
		return "login";
	}
	
}
