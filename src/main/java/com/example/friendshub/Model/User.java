package com.example.friendshub.Model;


import java.util.Date;
//import java.sql.Timestamp;
//import java.sql.Timestamp;
import java.util.Objects;

//import java.security.Timestamp;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//import io.jsonwebtoken.lang.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@Document(collection = "user")
public class User {
    @Id
	private String userID;

	private String userName;
    private String email;
    private String password;
	private String userImage;
	private boolean active;
	//private Timestamp joiningDate;
    private Date joiningDate;
	


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, email, password);
    }
    
}
