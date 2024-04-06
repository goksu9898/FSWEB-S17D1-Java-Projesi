package com.workintech.springinitial.SpringBasics.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    @Value("${animal.id}")

    private int id;
    private String species;
    @Value("${animal.name}")
    private String name;

    public Animal() {
    }

    public Animal(int id, String species, String name) {
        this.id = id;
        this.species = species;
        this.name = name;
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }
}
