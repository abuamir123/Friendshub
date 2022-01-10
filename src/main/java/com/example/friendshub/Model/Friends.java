package com.example.friendshub.Model;



import org.springframework.data.annotation.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Friends {
    @Id
    private String friendID;
    
    //@DBRef
    private String userID;
}
