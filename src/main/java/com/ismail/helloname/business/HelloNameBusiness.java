package com.ismail.helloname.business;

import com.ismail.helloname.entities.Name;

import java.util.List;

public class HelloNameBusiness {

    HelloNameRepository helloNameRepository;

    public final static String HELLO = "Hello ";

    public HelloNameBusiness(HelloNameRepository helloNameRepository) {
        this.helloNameRepository = helloNameRepository;
    }

    public HelloNameBusiness() {
    }

    public void createHelloName(String name) {
        Name helloName = new Name();
        helloName.setName(HELLO + name);
        helloNameRepository.save(helloName);
    }

    public List<Name> getAllHelloNames() {
        return helloNameRepository.findAll();
    }
}
