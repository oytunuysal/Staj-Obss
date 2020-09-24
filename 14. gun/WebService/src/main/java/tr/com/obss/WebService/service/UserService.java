package tr.com.obss.WebService.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import tr.com.obss.WebService.model.Address;
import tr.com.obss.WebService.model.User;
import tr.com.obss.WebService.repository.AddressRepository;
import tr.com.obss.WebService.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findByEmailAddress(@RequestBody User user) {
		return userRepository.findByEmailAddress(user.email);
	}

	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

	public User getUserByUserName(String userName) {
		return userRepository.getUserByUserName(userName);
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User getUserById(User user) {
		return userRepository.getUserById(user.getId());
	}

	public User getUserByEmailandusername(User user) {
		return userRepository.getUserByEmailandusername(user.getEmail(), user.getUser_name());
	}

	public void deleteUser(User user) {
		userRepository.delete(user);
	}

	public List<User> saveAll(User[] users) {
		return userRepository.saveAll(Arrays.asList(users));
	}

	// @Transactional
	public List<User> saveAllOneByOne(User[] users) {
		List<User> userList = new ArrayList<User>();
		for (User user : users) {
			userList.add(userRepository.save(user));
		}
		return userList;
	}

	public User findByAddress(Address address) {
		return userRepository.findByAddress(address);
	}

}
