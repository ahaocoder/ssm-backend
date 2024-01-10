package com.example.granary.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.granary.mapper.WorkerMapper;
import com.example.granary.model.dto.WorkerDto;
import com.example.granary.model.entity.Worker;
import com.example.granary.service.WorkerService;
import com.example.granary.util.result.Result;
import com.example.granary.util.result.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkerServiceImpl implements WorkerService {
    private final WorkerMapper workerMapper;

    public Result<List<Worker>> getAllWorker() {
        return ResultUtil.createResult(
                200, "Success", workerMapper.selectList(null)
        );
    }

    public void addWorker(WorkerDto workerDto) {
        Worker worker = new Worker();
        worker.setId(null);
        worker.setName(workerDto.getName());
        worker.setPosition(workerDto.getPosition());
        worker.setDescription(workerDto.getDescription());
        workerMapper.insert(worker);
    }

    public Result<Worker> getWorker(String name) {
        QueryWrapper<Worker> queryWrapper = new QueryWrapper<>();
        return ResultUtil.createResult(
                200, "Success", workerMapper.selectOne(queryWrapper.eq("name", name)));
    }

    public void deleteWorker(String name) {
        QueryWrapper<Worker> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        workerMapper.delete(queryWrapper);
    }

    public void updateWorker(Worker worker) {
        UpdateWrapper<Worker> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", worker.getId());
        workerMapper.update(worker, updateWrapper);
    }
}
