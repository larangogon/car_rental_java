package com.example.controller;

import com.example.model.Automobile;
import java.util.*;
import com.example.service.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class AutomobileRestController {

    @Autowired
    private AutomobileService service;

    @GetMapping(value = "/all")
    public List<Automobile> getAll() {
        return service.list();

    }

    @GetMapping(value = "/find/{id}")
    public Automobile find(@PathVariable int id) {
        return service.get(id);

    }

    @PostMapping(value = "/save")
    public ResponseEntity<Automobile> save(@RequestBody Automobile automobile) {
        Automobile obj = service.save(automobile);
        return new ResponseEntity<>(obj, HttpStatus.OK);

    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
