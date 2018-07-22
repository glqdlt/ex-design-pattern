package com.glqdlt.example.exdesignpattern.factory;


import lombok.Data;
import lombok.Getter;

@Getter
public abstract class Robot {

    void setName(String name) {
        this.name = name;
    }

    private String name;


}
