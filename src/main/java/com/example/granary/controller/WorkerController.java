package com.example.granary.controller;

import com.example.granary.model.entity.Worker;
import com.example.granary.service.WorkerService;
import com.example.granary.util.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class WorkerController {
    private final WorkerService workerService;

    @GetMapping("/getAllWorker")
    public Result<List<Worker>> getAllWorker(){
        return workerService.getAllWorker();
    }
}
