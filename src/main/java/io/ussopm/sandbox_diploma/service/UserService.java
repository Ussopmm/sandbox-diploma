package io.ussopm.sandbox_diploma.service;

import io.ussopm.sandbox_diploma.entity.User;
import io.ussopm.sandbox_diploma.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {

//        return this.userRepository.getAllUsers();
        return this.userRepository.getAllUsers();
    }


    public boolean login(String username, String password) {
        boolean success = false;
//        Optional<User> user = this.userRepository.findUserByUsernameAndPassword(username, password);
//        if (user.isPresent()) {
//            success = true;
//        }
        return success;
    }

    public List<User> getUserByUsername(String username) {
        return this.userRepository.getUserByUsername(username);
    }
}
