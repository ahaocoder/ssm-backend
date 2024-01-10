package com.example.granary.service.impl;

import com.example.granary.mapper.HygrometerMapper;
import com.example.granary.model.entity.Hygrometer;
import com.example.granary.service.HygrometerService;
import com.example.granary.util.result.Result;
import com.example.granary.util.result.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HygrometerServiceImpl implements HygrometerService {
    private final HygrometerMapper hygrometerMapper;

    public Result<List<Hygrometer>> getAllHygrometer() {
        return ResultUtil.createResult(200, "Success",
                hygrometerMapper.selectList(null));
    }
}
