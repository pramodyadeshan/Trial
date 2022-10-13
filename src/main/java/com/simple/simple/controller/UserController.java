package com.simple.simple.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser()
    {
        return "View User";
    }

    @PostMapping("/saveUser")
    public String saveUser()
    {
        return "Save User";
    }

}
