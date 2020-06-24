package com.ismail.helloname.controllers;

import com.ismail.helloname.business.HelloNameBusiness;
import com.ismail.helloname.entities.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("name")
public class HelloNameController {

    private HelloNameBusiness helloNameBusiness;

    @GetMapping("/all")
    public List<Name> getAllNames(){
        return helloNameBusiness.getAllHelloNames();
    }

    @PostMapping
    public void createName(String name){
        helloNameBusiness.createHelloName(name);
    }
}
