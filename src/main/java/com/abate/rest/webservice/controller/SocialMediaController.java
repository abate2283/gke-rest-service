package com.abate.rest.webservice.controller;

import com.abate.rest.webservice.dao.UserDaoService;
import com.abate.rest.webservice.model.Users;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class SocialMediaController {
    @Autowired
    private final UserDaoService service;

    public SocialMediaController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/get-users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Users>> listUsers(){
        List<Users> allUsers = service.findAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @GetMapping(path = "/get-users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Users> retrieveUser(@PathVariable int id){
        Users users = service.findOne(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping(path = "/users")
    public ResponseEntity<Users> createUser(@Valid @RequestBody Users users){
        Users users1 = service.saveUser(users);
        return new ResponseEntity<>(users1, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/delete-users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    @PutMapping(path = "/update/{value}")
    public Users updateUser(@RequestBody Users users, @PathVariable String value){
        return null;
    }

    @DeleteMapping(path = "/remove/{id}")
    public void deleteAUser(@PathVariable int id){
        service.aDeleteById(id);

    }
}
