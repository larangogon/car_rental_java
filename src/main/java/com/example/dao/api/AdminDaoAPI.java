package com.example.democrud.dao.api;

import com.example.democrud.model.Admin;

import org.springframework.data.repository.CrudRepository;

public interface AdminDaoAPI extends CrudRepository<Admin, Long> {

	Admin findByAdmin(String admin);
}
