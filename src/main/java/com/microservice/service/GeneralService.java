package com.microservice.service;

import java.util.List;
import java.util.Optional;

public interface GeneralService<T> {

    Optional<T> findById(long id);

    List<T> findAll();

    T save(T t);
    
    T update (T t);

    void delete(T t);
}
