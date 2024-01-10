package com.example.granary.service.impl;

import com.example.granary.mapper.ThermometerMapper;
import com.example.granary.model.entity.Thermometer;
import com.example.granary.service.ThermometerService;
import com.example.granary.util.result.Result;
import com.example.granary.util.result.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ThermometerServiceImpl implements ThermometerService {
    private final ThermometerMapper thermometerMapper;

    public Result<List<Thermometer>> getAllThermometer() {
        return ResultUtil.createResult(200, "Success",
                thermometerMapper.selectList(null));
    }
}
