package com.example.granary.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.granary.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
