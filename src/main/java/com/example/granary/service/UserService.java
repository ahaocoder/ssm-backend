package com.example.granary.service;

import com.example.granary.model.dto.UserDto;
import com.example.granary.util.result.Result;

public interface UserService {
    Result<String> login(UserDto userDto);
}
