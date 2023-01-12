package org.example.controller;


import org.example.Bcrypt.EncryptHelper;
import org.example.domain.User;
import org.example.service.LoginService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final EncryptHelper encryptHelper;
    private final LoginService loginService;

    @Autowired
    public UserController(UserService userService, EncryptHelper encryptHelper, LoginService loginService) {
        this.userService = userService;
        this.encryptHelper = encryptHelper;
        this.loginService = loginService;
    }

    @RequestMapping(value = "/R",method = RequestMethod.POST)
    public String createUser(User user) {
        user.setUserpw(encryptHelper.encrypt(user.getUserpw()));
        userService.createUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User UserInfo(@PathVariable("id") Long id) {
        return userService.getUserInfo(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@RequestBody User user,@PathVariable("id") Long id) {
        user.setUserid(id);
        userService.updateUserInfo(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/D", method = RequestMethod.POST)
    public String deleteUser(@RequestParam("id") Long id,@RequestParam("pw") String pw) {
        if(encryptHelper.ismatch(pw,loginService.getUserpw(id))) {
            userService.deleteUser(id);
            return "redirect:/";
        }
        else {
            return "redirect:/Exit";
        }
    }

}

