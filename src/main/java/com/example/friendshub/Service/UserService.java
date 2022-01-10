package com.example.friendshub.Service;

//import java.sql.Timestamp;
//import java.security.Timestamp;
import java.util.Date;
//import java.util.List;

import com.example.friendshub.Model.User;
import com.example.friendshub.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
	UserRepository userRepository;
	
	
	public User saveUser(User user) {
		
		/*Date date=new Date();
		long time=date.getTime();
		Timestamp dateTime=new Timestamp(time);

		user.setActive(true);
		user.setJoiningDate(dateTime);*/
		Date date=new Date();
		user.setJoiningDate(date);
		user.setActive(true);
		
		return userRepository.save(user);
	}


}
