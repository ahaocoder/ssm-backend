package com.example.granary.service;

import com.example.granary.model.entity.Hygrometer;
import com.example.granary.util.result.Result;

import java.util.List;

public interface HygrometerService {
    Result<List<Hygrometer>> getAllHygrometer();
}
