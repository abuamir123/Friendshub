package com.example.friendshub.Controller;

import com.example.friendshub.Model.Friends;
import com.example.friendshub.Service.FriendsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/friends")
public class FriendsController {
    @Autowired
	FriendsService friendsService;
	
	@PostMapping("/save")
	public Friends userRegistration(@RequestBody Friends friends) {
		return friendsService.saveFriend(friends);
	}
    
}
