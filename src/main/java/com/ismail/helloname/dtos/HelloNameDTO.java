package com.ismail.helloname.dtos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hello_name")
public class HelloNameDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String name;

    public HelloNameDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public HelloNameDTO() {
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
        HelloNameDTO helloNameDTO = (HelloNameDTO) o;
        return id == helloNameDTO.id &&
                name.equals(helloNameDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
