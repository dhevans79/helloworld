package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private final PersonRepository repo;

    PersonController(PersonRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/person")
    List<Person> all() {
        return repo.findAll();
    }

    @PostMapping("/person")
    Person newPerson(@RequestBody Person person) {
        return repo.save(person);
    }

    @GetMapping("/person/{id}")
    Person getOne(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

}
