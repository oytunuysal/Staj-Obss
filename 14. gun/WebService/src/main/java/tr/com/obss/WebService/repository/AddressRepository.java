package tr.com.obss.WebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.obss.WebService.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	// @Query(value = "insert into person (email,user_name,age) VALUE (?1,?2,?3)")
	// boolean saveUser(String email, String user_name, int age);

//	getAllUser + 
//	getUserById
//	getUserByUserName + 
//	getUserByEmailandusername()
//	saveUser
//	updateUser
//	patchUser(int age)
//	deleteUser()

}
