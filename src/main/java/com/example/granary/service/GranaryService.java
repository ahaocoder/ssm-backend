package com.example.granary.service;

import com.example.granary.model.entity.Granary;
import com.example.granary.util.result.Result;

import java.util.List;

public interface GranaryService {
    Result<List<Granary>> getAllGranary();
}
