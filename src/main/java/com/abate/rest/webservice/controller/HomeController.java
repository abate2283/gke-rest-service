package com.abate.rest.webservice.controller;

import com.abate.rest.webservice.model.Greetings;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greetings welcome(){
        return new Greetings("Hello", "Mr Stranger", "Welcome To Broken Arrow");
    }

    @GetMapping("/{location}")
    public ResponseEntity<Greetings> getLocation(@PathVariable("location") String location){
        Greetings greetings = new Greetings("Hello", "Mr Jones", "Houston");
        return new ResponseEntity<>(greetings, HttpStatus.CREATED);

    }

    @GetMapping(path = "/get/{site}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Greetings> detailLocation(@PathVariable("site") String site){
        Greetings greetings = new Greetings("Welcome", "Customer", "New Jersey");
        return new ResponseEntity<>(greetings, HttpStatus.CREATED);
    }

}
