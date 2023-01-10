package Service;
import java.util.Optional;

import model.Role;
import model.User;


public interface UserService {
	
	User saveUser(User user);

	Optional<User> findByUsername(String username);

	void changeRole(Role newRole, String username);
	
}
