package org.example.service;

import org.example.repository.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpI implements LoginService{
    private LoginMapper loginMapper;
    @Autowired
    public LoginServiceImpI(LoginMapper loginMapper){
        this.loginMapper = loginMapper;
    }
    @Override
    public String getUserpw(long id) {
        return loginMapper.getUserpw(id);
    }
}
