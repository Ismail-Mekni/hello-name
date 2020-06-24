package com.ismail.helloname.business;

import com.ismail.helloname.entities.Name;

import java.util.List;

public interface HelloNameRepository {

    void save(Name name);

    List<Name> findAll();
}
