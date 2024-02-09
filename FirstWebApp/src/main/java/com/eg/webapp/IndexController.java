package com.eg.webapp;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		
		return "index.jsp";
	}
}
