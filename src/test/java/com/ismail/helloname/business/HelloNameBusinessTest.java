package com.ismail.helloname.business;


import com.ismail.helloname.entities.Name;
import com.ismail.helloname.repositories.MockHelloNameRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;

public class HelloNameBusinessTest {

    private HelloNameBusiness helloNameBusiness;

    @BeforeEach
    public void setUp(){
        helloNameBusiness=new HelloNameBusiness(new MockHelloNameRepositoryImpl());
    }

    @Test
    public void testCreateHelloName(){
        helloNameBusiness.createHelloName("Ismail");
    }

    @Test
    public void testGetAllHelloNames(){
        List<Name> names=helloNameBusiness.getAllHelloNames();

        Assert.noNullElements(names, "Testing not null elements");
    }

}
