package com.example.democrud.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.democrud.dao.api.AdminDaoAPI;
import com.example.democrud.model.Admin;

@Service("adminDetailsService")
public class AdminDetailsService implements UserDetailsService {
	
	@Autowired
	private AdminDaoAPI adminDaoAPI;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Admin admin = adminDaoAPI.findByAdmin(username);
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(admin.getRoleName()));
		return new User(username, admin.getPassword(), authorities);
	}

}
