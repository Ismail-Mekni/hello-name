package com.ismail.helloname.repositories.impl;

import com.ismail.helloname.daos.HelloNameDAO;
import com.ismail.helloname.dtos.HelloNameDTO;
import com.ismail.helloname.entities.HelloName;
import com.ismail.helloname.repositories.HelloNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HelloNameRepositoryImpl implements HelloNameRepository {

    @Autowired
    private HelloNameDAO nameDAO;

    @Override
    public void save(HelloName helloName) {
        HelloNameDTO helloNameDTO = new HelloNameDTO();
        helloNameDTO.setName(helloName.getName());
        nameDAO.save(helloNameDTO);
    }

    @Override
    public List<HelloName> findAll() {
        return nameDAO.findAll().stream().map(helloNameDTO -> new HelloName(helloNameDTO.getName())).collect(Collectors.toList());
    }

    public HelloNameDAO getNameDAO() {
        return nameDAO;
    }

    public void setNameDAO(HelloNameDAO nameDAO) {
        this.nameDAO = nameDAO;
    }
}
