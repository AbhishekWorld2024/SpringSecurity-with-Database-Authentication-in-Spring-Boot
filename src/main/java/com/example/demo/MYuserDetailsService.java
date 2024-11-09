package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MYuserDetailsService implements UserDetailsService{

	
	@Autowired
	private Detailsrepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Userdetails details=(Userdetails) repo.findByUsername(username);
		if (username == null) {
	        throw new UsernameNotFoundException("User not found with username: " + username);
		
	}
	
	
		return new userprincipal(details);
	}
}
