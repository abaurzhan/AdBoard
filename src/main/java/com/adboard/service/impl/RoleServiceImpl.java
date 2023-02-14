package com.adboard.service.impl;

import com.adboard.domain.Role;
import com.adboard.repository.RoleRepository;
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
public class RoleServiceImpl implements CrudService<Role> {

    RoleRepository repository;

    @Override
    public void save(Role role) {
        repository.save(role);
    }

    @Override
    public void update(Role role) {
        repository.save(role);
    }
}
