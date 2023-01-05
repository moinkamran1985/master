package com.example.moinrest;

import jakarta.persistence.*;

@Entity
public class City {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
