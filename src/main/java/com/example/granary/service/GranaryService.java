package com.example.granary.service;

import com.example.granary.model.dto.GranaryDto;
import com.example.granary.model.entity.Granary;
import com.example.granary.util.result.Result;

import java.util.List;

public interface GranaryService {
    Result<List<Granary>> getAllGranary();

    Result<Granary> getGranary(String name);

    void addGranary(GranaryDto granaryDto);

    void deleteGranary(int id);

    void clearGranaryStock(int id);

    void updateGranary(Granary granary);
}
