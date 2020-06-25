package com.ismail.helloname.repositories.impl;

import com.ismail.helloname.daos.NameDAO;
import com.ismail.helloname.dtos.NameDTO;
import com.ismail.helloname.entities.Name;
import com.ismail.helloname.repositories.HelloNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HelloNameRepositoryImpl implements HelloNameRepository {

    @Autowired
    private NameDAO nameDAO;

    @Override
    public void save(Name name) {
        NameDTO nameDTO = new NameDTO();
        nameDTO.setName(name.getName());
        nameDAO.save(nameDTO);
    }

    @Override
    public List<Name> findAll() {
        return nameDAO.findAll().stream().map(nameDTO -> new Name(nameDTO.getName())).collect(Collectors.toList());
    }

    public NameDAO getNameDAO() {
        return nameDAO;
    }

    public void setNameDAO(NameDAO nameDAO) {
        this.nameDAO = nameDAO;
    }
}
