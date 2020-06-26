package com.ismail.helloname.repositories;

import com.ismail.helloname.entities.HelloName;

import java.util.List;

public interface HelloNameRepository {

    void save(HelloName helloName);

    List<HelloName> findAll();
}
