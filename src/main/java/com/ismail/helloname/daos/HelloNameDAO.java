package com.ismail.helloname.daos;

import com.ismail.helloname.dtos.HelloNameDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloNameDAO extends JpaRepository<HelloNameDTO, Integer> {
}
