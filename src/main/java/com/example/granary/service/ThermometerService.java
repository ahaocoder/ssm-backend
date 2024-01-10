package com.example.granary.service;

import com.example.granary.model.entity.Thermometer;
import com.example.granary.util.result.Result;

import java.util.List;

public interface ThermometerService {
    Result<List<Thermometer>> getAllThermometer();
}
