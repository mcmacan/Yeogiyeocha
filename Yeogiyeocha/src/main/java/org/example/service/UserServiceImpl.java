package org.example.service;

import org.example.domain.User;
import org.example.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserInfo(long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userMapper.createUser(user);
    }
    @Override
    public void updateUserInfo(User user) {
       userMapper.updateUser(user);
    }
    @Override
    public void deleteUser(long id) {
        userMapper.deleteUserById(id);
    }
}
