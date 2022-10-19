package com.example.democrud.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.democrud.model.User;

public interface UserDaoAPI extends CrudRepository<User, Long> {

}
