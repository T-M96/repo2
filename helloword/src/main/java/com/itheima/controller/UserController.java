package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){

        return "<h3>helloWorld</h3>";
    }
}
