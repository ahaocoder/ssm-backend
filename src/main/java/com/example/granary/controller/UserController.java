package com.example.granary.controller;

import com.example.granary.model.entity.User;
import com.example.granary.model.form.UserForm;
import com.example.granary.service.UserService;
import com.example.granary.util.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String welcome() {
        return "欢迎来到豪哥-粮仓管理系统！";
    }

    @PostMapping("/api/login")
    public Result<String> login(@RequestBody UserForm userForm) {
        return userService.login(userForm);
    }

    @GetMapping("/api/getUser")
    public Result<User> getUser() {
        return userService.getUser();
    }
}
