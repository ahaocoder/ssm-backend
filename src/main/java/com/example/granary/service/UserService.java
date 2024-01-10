package com.example.granary.service;

import com.example.granary.model.form.UserForm;
import com.example.granary.util.result.Result;

public interface UserService {
    Result<String> login(UserForm userForm);
}
