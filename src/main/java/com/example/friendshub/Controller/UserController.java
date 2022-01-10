package com.example.friendshub.Controller;


import java.util.List;

import com.example.friendshub.Model.Response;
import com.example.friendshub.Model.User;
import com.example.friendshub.Repository.UserRepository;
//import com.example.friendshub.Repository.UserRepository;
import com.example.friendshub.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.Value;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;
	
	/*@PostMapping("/register")
	public User userRegistration( @RequestBody User user) {
		return userService.saveUser(user);
	}*/
	

	@PostMapping("/register")
    public Response registerUser( @RequestBody User newUser) {
        List<User> users = userRepository.findAll();
		

        for (User user : users) {
           
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return Response.USER_ALREADY_EXISTS;
            }
        }

         userService.saveUser(newUser);
        return Response.SUCCESS;
    }

    @PostMapping("/login")
    public Response loginUser( @RequestBody User user) {
        List<User> users = userRepository.findAll();

        for (User other : users) {
            if (other.equals(user)) {
               // user.setLoggedIn(true);
               // userService.saveUser(user);
                return Response.SUCCESS;
            }
        }

        return Response.FAILURE;
    }

    
}
