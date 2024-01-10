package com.example.granary.service.impl;

import com.example.granary.mapper.GranaryMapper;
import com.example.granary.model.entity.Granary;
import com.example.granary.service.GranaryService;
import com.example.granary.util.result.Result;
import com.example.granary.util.result.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GranaryServiceImpl implements GranaryService {
    private final GranaryMapper granaryMapper;

    public Result<List<Granary>> getAllGranary() {
        return ResultUtil.createResult(
                200, "Success", granaryMapper.selectList(null)
        );
    }
}
