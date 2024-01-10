package com.example.granary.service.impl;

import com.example.granary.mapper.WorkerMapper;
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
}
