package per.shey.xiaoyss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import per.shey.xiaoyss.service.UsersService;
import per.shey.xiaoyss.utils.Result;

@Controller
public class UserController {
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("Page/Home/Login")
	@ResponseBody
	public Result login(String username,String password,String validateCode){
		usersService.login(username,password);
		return Result.OK(null);
	}
}
