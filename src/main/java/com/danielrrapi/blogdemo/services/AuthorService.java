package com.danielrrapi.blogdemo.services;

import com.danielrrapi.blogdemo.entities.Author;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    private List<Author> authors = new ArrayList<>();

    public List<Author> getAuthors() {
        return authors;
    }
    public Author saveUser(Author newUser) {
        Random random = new Random();
        newUser.setId(random.nextInt(1, 1000000));
        this.authors.add(newUser);
        return newUser;
    }
    public Author findById(int id) {
        Author found = null;
        for (Author author : this.authors) {
            if (author.getId() == id) {
                found = author;
            }
        }
        if (found == null) {
            System.out.println("AUTHOR NOT FOUND");
        } else  return found;
    }
    public Author findByIdAndUpdate(int id, User updateUser) {}
}
