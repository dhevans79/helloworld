package com.example.demo;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(Long id) {
        super("Could not find person by id " + id);
    }
}
