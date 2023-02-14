package com.adboard.service;

import com.adboard.domain.Ad;

public interface AdService extends CrudService<Ad> {
    Ad findById(int id);
}
