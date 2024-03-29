package com.example.granary.controller;

import com.example.granary.model.dto.UserDto;
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
    public Result<String> login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }
}
