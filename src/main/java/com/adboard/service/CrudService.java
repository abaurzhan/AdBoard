package com.adboard.service;

public interface CrudService<T> {
    void save(T t);
    void update(T t);

}
