package com.example.granary.controller;

import com.example.granary.model.entity.Thermometer;
import com.example.granary.service.ThermometerService;
import com.example.granary.util.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ThermometerController {
    private final ThermometerService thermometerService;

    @GetMapping("/getAllThermometer")
    public Result<List<Thermometer>> getAllThermometer() {
        return thermometerService.getAllThermometer();
    }
}
