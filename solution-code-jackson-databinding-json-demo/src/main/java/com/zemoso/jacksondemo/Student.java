package com.zemoso.jacksondemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public @Data  class Student {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;

    private String[] languages;

    public Student() {
    }
}
