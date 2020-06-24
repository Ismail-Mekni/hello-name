package com.ismail.helloname.daos;

import com.ismail.helloname.dtos.NameDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameDAO extends CrudRepository<NameDTO, Integer> {
}
