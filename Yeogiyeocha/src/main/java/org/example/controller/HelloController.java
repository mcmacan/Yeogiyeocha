package org.example.controller;

import org.example.aop.LogExecutionTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping(value = "/Loginscces", method = RequestMethod.GET)
    @ResponseBody
    @LogExecutionTime
    public String hello() {
        return "Hello Spring (text)";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @LogExecutionTime
    public String helloBody() {
        return "redirect:/";
    }
}