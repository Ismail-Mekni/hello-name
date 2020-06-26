package com.ismail.helloname.business;

import com.ismail.helloname.entities.HelloName;
import com.ismail.helloname.repositories.HelloNameRepository;

import java.util.List;

public class HelloNameBusiness {

    private HelloNameRepository helloNameRepository;

    public final static String HELLO = "Hello ";

    public HelloNameBusiness(HelloNameRepository helloNameRepository) {
        this.helloNameRepository = helloNameRepository;
    }

    public HelloNameBusiness() {
    }

    public void createHelloName(String name) {
        HelloName helloName = new HelloName();
        helloName.setName(HELLO + name);
        helloNameRepository.save(helloName);
    }

    public List<HelloName> getAllHelloNames() {
        return helloNameRepository.findAll();
    }
}
