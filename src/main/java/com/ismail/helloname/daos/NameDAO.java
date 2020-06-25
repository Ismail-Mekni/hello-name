package com.ismail.helloname.daos;

import com.ismail.helloname.dtos.NameDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameDAO extends JpaRepository<NameDTO, Integer> {
}
