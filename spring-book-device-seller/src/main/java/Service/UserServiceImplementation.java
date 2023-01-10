package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import model.Role;
import model.User;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public User  saveUser(User user)
	{
		//encoding passwords
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRole(Role.USER);
		user.setCreateTime(LocalDateTime.now());
		
		return userRepository.save(user);
		
	}
	
	
	@Override
	public Optional<User> findByUsername(String username)
	{
		return UserRepository.findByUsername(username);
	}
	
	
	@Override
	public void changeRole(Role  newRole ,String username)
	{
		userRepository.updateUserRole(username, newRole);
		
	}
	
	
	
	

}
