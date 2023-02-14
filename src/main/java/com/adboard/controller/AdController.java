package com.adboard.controller;

import com.adboard.domain.Ad;
import com.adboard.service.AdService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ad")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class AdController {



    AdService adService;

    @PostMapping
    public void save(@RequestBody Ad ad) {
        adService.save(ad);
    }

    @PutMapping
    public void update(@RequestBody Ad ad) {
        adService.update(ad);
    }

    @GetMapping("/{id}")
    public Ad findById(@PathVariable int id) {
        return adService.findById(id);
    }
}
