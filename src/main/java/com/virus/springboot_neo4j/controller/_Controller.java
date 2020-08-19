package com.virus.springboot_neo4j.controller;

import com.virus.springboot_neo4j.model.Person;
import com.virus.springboot_neo4j.repositroy.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class _Controller {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/all")
    public List<Person> getAll(){
        return (List<Person>) personRepository.findAll();
    }

    @PostMapping("/add")
    public Person addAll(@RequestBody Person person){
        return personRepository.save(person);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        personRepository.deleteById(id);
        return "Delete person with "+id;
    }

    @GetMapping("/getName/{name}")
    public List<Person> getPerson(@PathVariable String name) {
        return personRepository.findByName(name);
    }
}
