package com.zq.main.controller;

import com.zq.service.UserReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserReader userReader;

    @RequestMapping("/{id}/get")
    @ResponseBody
    public String getById(@PathVariable("id") long id) {
        return userReader.getById(id).toString();
    }

}
