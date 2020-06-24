package com.ismail.helloname.dtos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "name")
public class NameDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public NameDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public NameDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameDTO nameDTO = (NameDTO) o;
        return id == nameDTO.id &&
                name.equals(nameDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
