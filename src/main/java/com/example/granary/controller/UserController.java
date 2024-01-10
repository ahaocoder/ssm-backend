package com.example.granary.controller;

import com.example.granary.entity.User;
import com.example.granary.service.UserService;
import com.example.granary.util.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@AllArgsConstructor
public class UserController {
//    private final UserService userService;

    @ResponseBody
    @GetMapping("/")
    public String welcome() {
        return "欢迎来到豪哥-粮仓管理系统！";
    }

//    @PostMapping("/api/login")
//    public Result<String> login(@RequestBody User userForm) {
//        return userService.login(userForm);
//    }
}