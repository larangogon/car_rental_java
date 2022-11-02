package com.example.service;

import com.example.model.Automobile;
import java.util.*;
import com.example.repository.AutomobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomobileService {

    @Autowired
    AutomobileRepository repository;

    //List automobile
    public List<Automobile> list() {
        return repository.findAll();
    }

    //Save automobile
    public Automobile save(automobile automobile) {
        return repository.save(automobile);
    }

    //Get automobile By Id
    public Automobile get(int id) {
        return repository.findById(id).get();
    }

    //Delete automobile
    public void delete(int id) {
        repository.deleteById(id);
    }
}
