package com.example.granary.controller;


import com.example.granary.model.dto.GranaryDto;
import com.example.granary.model.entity.Granary;
import com.example.granary.service.GranaryService;
import com.example.granary.util.result.Result;
import com.example.granary.util.result.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getGranary/{name}")
    public Result<Granary> getGranary(@PathVariable String name) {
        return granaryService.getGranary(name);
    }

    @PostMapping("/addGranary")
    public Result<String> addGranary(@RequestBody GranaryDto granaryDto) {
        try {
            granaryService.addGranary(granaryDto);
        } catch (Exception e) {
            return ResultUtil.createResult(400, "Error", null);
        }
        return ResultUtil.createResult(200, "Success", null);
    }

    @DeleteMapping("/deleteGranary/{id}")
    public Result<String> deleteGranary(@PathVariable int id) {
        try {
            granaryService.deleteGranary(id);
        } catch (Exception e) {
            return ResultUtil.createResult(400, "Error", null);
        }
        return ResultUtil.createResult(200, "Success", null);
    }

    @GetMapping("/clearGranaryStock/{id}")
    public Result<String> clearGranaryStock(@PathVariable int id) {
        try {
            granaryService.clearGranaryStock(id);
        } catch (Exception e) {
            return ResultUtil.createResult(400, "Error", null);
        }
        return ResultUtil.createResult(200, "Success", null);
    }

    @PostMapping("/updateGranary")
    public Result<String> updateGranary(@RequestBody Granary granary) {
        try {
            granaryService.updateGranary(granary);
        } catch (Exception e) {
            return ResultUtil.createResult(400, "Error", null);
        }
        return ResultUtil.createResult(200, "Success", null);
    }
}
