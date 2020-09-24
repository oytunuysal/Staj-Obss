package tr.com.obss.WebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tr.com.obss.WebService.model.User;
import tr.com.obss.WebService.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@PostMapping(value = "/user")
	public User userMethod(@RequestBody User user) {
		System.out.println("1");
		return userService.findByEmailAddress(user);
	}
	
	@PostMapping(value = "/getallusers")
	public List<User> gelalluserMethod() {
		System.out.println("1");
		return userService.getAllUser();
	}
	
	@PostMapping(value = "/getuserbyusername")
	public User getUserByUserName(@RequestBody User user) {
		return userService.getUserByUserName(user.user_name);
	}
	

}
