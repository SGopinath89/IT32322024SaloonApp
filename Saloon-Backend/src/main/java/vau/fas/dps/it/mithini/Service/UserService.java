package vau.fas.dps.it.mithini.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vau.fas.dps.it.mithini.Model.User;
import vau.fas.dps.it.mithini.Repository.UserRepo;

@Service
public class UserService {
	 @Autowired
	    private UserRepo userRepository;

	    public List<User> findAll() {
	        return userRepository.findAll();
	    }

	    public User save(User user) {
	        return userRepository.save(user);
	    }

	    public User findById(Long id) {
	        return userRepository.findById(id).orElse(null);
	    }

	    public void delete(Long id) {
	        userRepository.deleteById(id);
	    }
}


