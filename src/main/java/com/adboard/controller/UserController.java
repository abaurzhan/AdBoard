package com.adboard.controller;

import com.adboard.domain.Ad;
import com.adboard.domain.User;
import com.adboard.service.AdService;
import com.adboard.service.CrudService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class UserController {

    CrudService<User> service;

    @PostMapping
    public void save(@RequestBody User user) {
        service.save(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        service.update(user);
    }

}
