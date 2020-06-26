package com.ismail.helloname.controllers;

import com.ismail.helloname.business.HelloNameBusiness;
import com.ismail.helloname.entities.HelloName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("name")
public class HelloNameController {

    @Autowired
    private HelloNameBusiness helloNameBusiness;

    @GetMapping("/all")
    public List<HelloName> getAllNames(){
        return helloNameBusiness.getAllHelloNames();
    }

    @PostMapping
    public void createName(@RequestBody String name){
        helloNameBusiness.createHelloName(name);
    }
}
