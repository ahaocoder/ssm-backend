package com.example.granary.controller;

import com.example.granary.model.entity.Hygrometer;
import com.example.granary.service.HygrometerService;
import com.example.granary.util.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class HygrometerController {
    private final HygrometerService hygrometerService;

    @GetMapping("/getAllHygrometer")
    public Result<List<Hygrometer>> getAllHygrometer() {
        return hygrometerService.getAllHygrometer();
    }
}
