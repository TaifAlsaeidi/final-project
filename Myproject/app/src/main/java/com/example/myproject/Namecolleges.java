package com.example.myproject;

import java.io.Serializable;

public class Namecolleges implements Serializable {
    private String name ;

    public Namecolleges(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
