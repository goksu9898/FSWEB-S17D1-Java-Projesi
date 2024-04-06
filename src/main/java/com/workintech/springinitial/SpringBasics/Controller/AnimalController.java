package com.workintech.springinitial.SpringBasics.Controller;

import com.workintech.springinitial.SpringBasics.Entity.Animal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PatchExchange;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech")
public class AnimalController {
    Map<Integer, Animal> animals = new HashMap<>();

    @PostMapping("/animal")
    public Animal add(@RequestBody Animal animal) {
        animals.put(animal.getId(), new Animal(animal.getId(), animal.getName()));
        return animals.get(animal.getId());
    }

    @GetMapping("/animal")
    public List<Animal> getAll() {
        return animals.values().stream().toList();

    }
    @GetMapping("/animal/{id}")
    public Animal getById(@PathVariable int id) {

        return animals.get(id);
    }
    @PutMapping("/animal/{id}")
    public void update(@RequestBody Animal animal, @PathVariable int id){
        animals.put(id,new Animal(animal.getId(), animal.getName()));
    }
    @DeleteMapping("/animal/{id}")
    public Animal delete(@PathVariable int id ){
        return animals.remove(id);
    }
}

