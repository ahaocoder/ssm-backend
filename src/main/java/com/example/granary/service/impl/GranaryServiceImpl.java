package com.example.granary.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.granary.mapper.GranaryMapper;
import com.example.granary.model.dto.GranaryDto;
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

    public Result<Granary> getGranary(String name) {
        QueryWrapper<Granary> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        return ResultUtil.createResult(
                200, "Success", granaryMapper.selectOne(queryWrapper)
        );
    }

    public void addGranary(GranaryDto granaryDto) {
        Granary granary = new Granary();
        granary.setId(null);
        granary.setName(granaryDto.getName());
        granary.setStock(granaryDto.getStock());
        granaryMapper.insert(granary);
    }

    public void deleteGranary(int id) {
        granaryMapper.deleteById(id);
    }

    public void clearGranaryStock(int id) {
        Granary granary = granaryMapper.selectById(id);
        granary.setStock(0.0);
        UpdateWrapper<Granary> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", id);
        granaryMapper.update(granary, updateWrapper);
    }

    public void updateGranary(Granary granary) {
        UpdateWrapper<Granary> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", granary.getId());
        granaryMapper.update(granary, updateWrapper);
    }
}
