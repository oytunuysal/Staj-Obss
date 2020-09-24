package tr.com.obss.WebService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tr.com.obss.WebService.model.User;
import tr.com.obss.WebService.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public User findByEmailAddress(@RequestBody User user) {
		System.out.println("2");

		return repository.findByEmailAddress(user.email);

	}
	
	public List<User> getAllUser(){
		return repository.getAllUser();
	}
	
	public User getUserByUserName(String userName) {
		return repository.getUserByUserName(userName);
	}
}
