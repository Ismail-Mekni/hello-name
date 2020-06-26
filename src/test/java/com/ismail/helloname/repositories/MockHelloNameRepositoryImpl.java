package com.ismail.helloname.repositories;

import com.ismail.helloname.entities.HelloName;

import java.util.Arrays;
import java.util.List;

public class MockHelloNameRepositoryImpl implements HelloNameRepository {

    @Override
    public void save(HelloName helloName) {
        System.out.println(helloName.getName()+" Saved");
    }

    @Override
    public List<HelloName> findAll() {

        return Arrays.asList(new HelloName("Ismail"), new HelloName("Alaa"));
    }
}
