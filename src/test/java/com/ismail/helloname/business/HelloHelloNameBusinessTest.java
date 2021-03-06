package com.ismail.helloname.business;


import com.ismail.helloname.entities.HelloName;
import com.ismail.helloname.repositories.MockHelloNameRepositoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

import java.util.List;

public class HelloHelloNameBusinessTest {

    private HelloNameBusiness helloNameBusiness;

    @Before
    public void setUp(){
        helloNameBusiness=new HelloNameBusiness(new MockHelloNameRepositoryImpl());
    }

    @Test
    public void testCreateHelloName(){
        helloNameBusiness.createHelloName("Ismail");
    }

    @Test
    public void testGetAllHelloNames(){
        List<HelloName> helloNames =helloNameBusiness.getAllHelloNames();

        Assert.noNullElements(helloNames, "Testing not null elements");
    }

}
