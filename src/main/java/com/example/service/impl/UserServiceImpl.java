package com.example.democrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.democrud.commons.GenericServiceImpl;
import com.example.democrud.dao.api.UserDaoAPI;
import com.example.democrud.model.User;
import com.example.democrud.service.api.UserServiceAPI;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserServiceAPI {

	@Autowired
	private UserDaoAPI userDaoAPI;
	
	@Override
	public CrudRepository<User, Long> getDao() {
		return UserDaoAPI;
	}

}
