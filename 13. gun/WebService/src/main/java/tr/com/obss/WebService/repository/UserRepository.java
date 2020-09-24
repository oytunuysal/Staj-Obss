package tr.com.obss.WebService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tr.com.obss.WebService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT a FROM person a where a.email = ?1")
	User findByEmailAddress(String email);
	
	@Query("Select a from person a")
	List<User> getAllUser();
	
	@Query("Select a from person a where a.user_name = ?1")
	User getUserByUserName(String userName);

//	getAllUser + 
//	getUserById
//	getUserByUserName + 
//	getUserByEmailandusername()
//	saveUser
//	updateUser
//	patchUser(int age)
//	deleteUser()

}