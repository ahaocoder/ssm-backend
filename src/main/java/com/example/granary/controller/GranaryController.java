package com.example.granary.controller;


import com.example.granary.model.entity.Granary;
import com.example.granary.service.GranaryService;
import com.example.granary.util.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class GranaryController {
    private final GranaryService granaryService;

    @GetMapping("/getAllGranary")
    public Result<List<Granary>> getAllGranary() {
        return granaryService.getAllGranary();
    }
}
