package com.danielrrapi.blogdemo.exceptions;

public class NotFoundException extends  RuntimeException{
    public NotFoundException(int id) {
        super("L'entità con id " + id + " non è stata trovata");
    }
}
