package com.company.projj.projj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

    private long id;
    private String name;
    private int salaty;


    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaty() {
        return salaty;
    }

    public void setSalaty(int salaty) {
        this.salaty = salaty;
    }
}
