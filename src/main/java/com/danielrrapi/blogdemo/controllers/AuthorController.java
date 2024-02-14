package com.danielrrapi.blogdemo.controllers;

import com.danielrrapi.blogdemo.entities.Author;
import com.danielrrapi.blogdemo.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @GetMapping
    public List<Author> getAllAuthors() {
        return this.authorService.getAuthors();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author saveAuthor(@RequestBody Author author) {
        return this.authorService.saveAuthor(author);
    }
    @GetMapping("/{id}")
    public Author findById(@PathVariable int id) {
        return this.authorService.findById(id);
    }
}
