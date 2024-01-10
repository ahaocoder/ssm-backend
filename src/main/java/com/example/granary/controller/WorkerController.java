package com.example.granary.controller;

import com.example.granary.model.dto.WorkerDto;
import com.example.granary.model.entity.Worker;
import com.example.granary.service.WorkerService;
import com.example.granary.util.result.Result;
import com.example.granary.util.result.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class WorkerController {
    private final WorkerService workerService;

    @GetMapping("/getAllWorker")
    public Result<List<Worker>> getAllWorker() {
        return workerService.getAllWorker();
    }

    @PostMapping("/addWorker")
    public Result<String> addWorker(@RequestBody WorkerDto workerDto) {
        try {
            workerService.addWorker(workerDto);
        } catch (Exception e) {
            ResultUtil.createResult(400, "Error", null);
        }
        return ResultUtil.createResult(200, "Success", null);
    }

    @GetMapping("/getWorker/{name}")
    public Result<Worker> getWorker(@PathVariable String name) {
        return workerService.getWorker(name);
    }

    @DeleteMapping("/deleteWorker/{name}")
    public Result<String> deleteWorker(@PathVariable String name) {
        try {
            workerService.deleteWorker(name);
        } catch (Exception e) {
            ResultUtil.createResult(400, "Error", null);
        }
        return ResultUtil.createResult(200, "Success", null);
    }

    @PostMapping("/updateWorker")
    public Result<String> updateWorker(@RequestBody Worker worker) {
        try {
            workerService.updateWorker(worker);
        } catch (Exception e) {
            ResultUtil.createResult(400, "Error", null);
        }
        return ResultUtil.createResult(200, "Success", null);
    }
}
