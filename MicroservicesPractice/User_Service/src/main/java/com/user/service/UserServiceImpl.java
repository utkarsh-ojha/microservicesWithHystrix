package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //Fake User List
    List<User> list= List.of(
            new User(1311L,"Utkarsh Ojha","8877663338"),
            new User(1312L,"Kritika Ojha","6394568956"),
            new User(1313L,"Urmila Ojha","9308960021")

    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
