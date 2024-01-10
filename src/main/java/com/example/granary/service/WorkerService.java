package com.example.granary.service;

import com.example.granary.model.entity.Worker;
import com.example.granary.util.result.Result;

import java.util.List;

public interface WorkerService {
    Result<List<Worker>> getAllWorker();
}
