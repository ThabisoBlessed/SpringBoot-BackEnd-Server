package repository;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	//findBy + fieldName
	static Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Modifying
	@Query("update username set Role =:role where username=:username")
	void updateUserRole(@Param("username") String username, @Param("role") model.Role role);

	
	
}
