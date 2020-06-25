package com.ismail.helloname.repositories;

import com.ismail.helloname.entities.Name;

import java.util.List;

public interface HelloNameRepository {

    void save(Name name);

    List<Name> findAll();
}
