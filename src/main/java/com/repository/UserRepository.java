package com.repository;

import com.dto.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class UserRepository {

    private List<User> userList;

    public UserRepository(){
        userList = new ArrayList<>();
    }
}
