package com.example.friendshub.Repository;

import com.example.friendshub.Model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
}
