package org.example.controller;

import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.example.Bcrypt.EncryptHelper;

@Controller
public class LoginController {
    private final LoginService loginService;
    private final EncryptHelper encryptHelper;
    @Autowired
    public LoginController(LoginService loginService, EncryptHelper encryptHelper) {
        this.loginService = loginService;
        this.encryptHelper = encryptHelper;
    }

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String checkUser(@RequestParam(value = "id") Long id, @RequestParam(value = "pw") String pw){
        String a = loginService.getUserpw(id);
        System.out.println(encryptHelper.ismatch(pw,a));
        if(encryptHelper.ismatch(pw,a)){
            return "BusMenu";
        }
        else{
        return "redirect:/";}
    }
    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public String check(){
            return "BusMenu";
    }
    @RequestMapping(value = "/regident", method = RequestMethod.GET)
    public String regident(){
        return "regident";
    }
    @RequestMapping(value = "/Exit", method = RequestMethod.GET)
    public String Exit(){
        return "Exit";
    }
}
