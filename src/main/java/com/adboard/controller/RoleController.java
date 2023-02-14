package com.adboard.controller;

import com.adboard.domain.Ad;
import com.adboard.domain.Role;
import com.adboard.service.AdService;
import com.adboard.service.CrudService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class RoleController {

    CrudService<Role> service;

    @PostMapping
    public void save(@RequestBody Role role) {
        service.save(role);
    }

    @PutMapping
    public void update(@RequestBody Role role) {
        service.update(role);
    }

}
