package com.ismail.helloname.repositories;

import com.ismail.helloname.entities.Name;

import java.util.Arrays;
import java.util.List;

public class MockHelloNameRepositoryImpl implements HelloNameRepository {

    @Override
    public void save(Name name) {
        System.out.println(name.getName()+" Saved");
    }

    @Override
    public List<Name> findAll() {

        return Arrays.asList(new Name("Ismail"), new Name("Alaa"));
    }
}
