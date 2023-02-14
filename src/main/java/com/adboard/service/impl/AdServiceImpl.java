package com.adboard.service.impl;

import com.adboard.domain.Ad;
import com.adboard.repository.AdRepository;
import com.adboard.service.AdService;
import com.adboard.service.EmailService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdServiceImpl implements AdService {

    AdRepository repository;
    EmailService emailService;

    @Override
    public void save(Ad ad) {
        repository.save(ad);
    }

    @Override
    public void update(Ad ad) {
        repository.save(ad);
        emailService.sendEmail(ad);
    }

    @Override
    public Ad findById(int id) {
        return repository.findById(id).get();
    }
}
