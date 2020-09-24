package tr.com.obss.WebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tr.com.obss.WebService.model.Address;
import tr.com.obss.WebService.model.User;
import tr.com.obss.WebService.service.AddressService;
import tr.com.obss.WebService.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	AddressService addressService;

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

	@PostMapping(value = "/saveuser")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PostMapping(value = "/saveaddress")
	public Address saveUser(@RequestBody Address address) {
		return addressService.saveAddress(address);
	}

	@PostMapping(value = "/getuserbyid")
	public User getUserById(@RequestBody User user) {
		return userService.getUserById(user);
	}

	@PostMapping(value = "/getuserbyemailandusername")
	public User getUserByEmailandusername(@RequestBody User user) {
		return userService.getUserByEmailandusername(user);
	}

	@PostMapping(value = "/deleteuser")
	public void deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
	}

	@PostMapping(value = "/saveall")
	public List<User> saveAll(@RequestBody User[] users) {
		return userService.saveAll(users);

	}

	@PostMapping(value = "/saveallonebyone")
	public List<User> saveAllOneByOne(@RequestBody User[] users) {
		return userService.saveAllOneByOne(users);
	}

	@PostMapping(value = "/findbyaddress")
	public User searchUsersByAddress(@RequestBody Address address) {
		return userService.findByAddress(address);
	}

}
