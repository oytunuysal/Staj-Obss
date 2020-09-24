package tr.com.obss.WebService.model;

import javax.validation.constraints.Email;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "person")
public class User {

	@Id
	@Email
	public String email;

	public String user_name;

	public int age;
	
	public User() {
		
	}

	public User(String userName, String email, int age) {
		this.user_name = userName;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userName=" + user_name + ", email=" + email + ", age=" + age + "]";
	}

}
