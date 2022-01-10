package com.example.friendshub.Service;

import com.example.friendshub.Model.Friends;
import com.example.friendshub.Repository.FriendsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsService {
    @Autowired
	FriendsRepository friendsRepository;
	
    public Friends saveFriend(Friends friends) {
		
		return friendsRepository.save(friends);
	}
}
