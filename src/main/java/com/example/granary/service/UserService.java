package com.example.granary.service;

import com.example.granary.entity.User;
import com.example.granary.util.result.Result;

public interface UserService {
    Result<String> login(User user);
}
