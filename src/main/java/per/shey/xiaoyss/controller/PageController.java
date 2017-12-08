package per.shey.xiaoyss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/Page")
	public String ShowIndex(){
		return "Home/index";
	}
	
	@RequestMapping("/Page/Home/ToLogin")
	public String ShowLogin(){
		return "Home/console_login";
	}
}
