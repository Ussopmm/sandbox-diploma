package io.ussopm.sandbox_diploma.controller;

import io.ussopm.sandbox_diploma.dao.UserDAO;
import io.ussopm.sandbox_diploma.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AuthenticationController {
    private UserDAO userDAO = new UserDAO();

    @GetMapping("/get")
    public List<User> getUsersByUsername(@RequestParam String username) {
        return this.userDAO.getUsersByUsername(username);
    }

    @GetMapping("/getSecure")
    public User getUserByUsername(@RequestParam String username) {
        return this.userDAO.getUserByUsername(username);
    }

    @GetMapping("/getById/{id}")
    public List<User> getUserById(@PathVariable String id) {
        return this.userDAO.getUserById(id);
    }

    @GetMapping("/getByIdSecure/{id}")
    public User getUserByIdSecure(@PathVariable Long id) {
        return this.userDAO.getUserByIdSecure(id);
    }
}
