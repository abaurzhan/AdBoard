package com.adboard.service.impl;

import com.adboard.domain.User;
import com.adboard.repository.UserRepository;
import com.adboard.service.CrudService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements CrudService<User> {

    UserRepository repository;

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }
}
