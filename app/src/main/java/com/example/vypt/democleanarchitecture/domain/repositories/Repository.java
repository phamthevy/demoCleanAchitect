package com.example.vypt.democleanarchitecture.domain.repositories;

import com.example.vypt.democleanarchitecture.domain.models.OneModel;

public interface Repository {

    boolean insert (OneModel model);
    boolean delete (OneModel model);
    boolean update (OneModel model);
    OneModel get(Object id);
}
