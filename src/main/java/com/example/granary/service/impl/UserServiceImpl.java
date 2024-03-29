package com.example.granary.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.granary.model.entity.User;
import com.example.granary.mapper.UserMapper;
import com.example.granary.model.dto.UserDto;
import com.example.granary.service.UserService;
import com.example.granary.util.result.Result;
import com.example.granary.util.result.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public Result<String> login(UserDto userDto) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userDto.getUsername());
        User user = userMapper.selectOne(queryWrapper);

        if (user != null) {
            if (Objects.equals(user.getPassword(), userDto.getPassword())) {
                return ResultUtil.createResult(200, "登录成功", "Token");
            }
        } else {
            ResultUtil.createResult(400, "无此用户", null);
        }

        return ResultUtil.createResult(400, "登录失败", null);
    }
}
