package tr.com.obss.WebService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tr.com.obss.WebService.model.Address;
import tr.com.obss.WebService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT a FROM person a where a.email = ?1")
	User findByEmailAddress(String email);

	@Query("Select a from person a")
	List<User> getAllUser();

	@Query("Select a from person a where a.user_name = ?1")
	User getUserByUserName(String userName);
	
	@Query("Select a from person a where a.id = ?1")
	User getUserById(Long id);
	
	@Query("Select a from person a where a.email = ?1 AND a.user_name = ?2")
	User getUserByEmailandusername(String email, String username);
	
	
	//@Query("Select p from person as p, address as a where p.address_id = a.id AND a.first_line = ?1")
	//List<User> searchUsersByAddress(String first_line);
	User findByAddress(Address address);


//	getAllUser + 
//	getUserById +
//	getUserByUserName + 
//	getUserByEmailandusername() + 
//	saveUser + 
//	updateUser ? 
//	patchUser(int age)
//	deleteUser() +

}