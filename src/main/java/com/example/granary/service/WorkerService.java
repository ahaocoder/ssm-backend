package com.example.granary.service;

import com.example.granary.model.dto.WorkerDto;
import com.example.granary.model.entity.Worker;
import com.example.granary.util.result.Result;

import java.util.List;

public interface WorkerService {
    Result<List<Worker>> getAllWorker();

    void addWorker(WorkerDto workerDto);

    Result<Worker> getWorker(String name);

    void deleteWorker(String name);

    void updateWorker(Worker worker);
}
