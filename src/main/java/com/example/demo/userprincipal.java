package com.example.demo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class userprincipal implements UserDetails {

	private Userdetails details;

	public userprincipal(Userdetails details) {
		this.details=details;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
	}

	@Override
	public String getPassword() {
	
		return details.getPassword();
	}

	@Override
	public String getUsername() {
	
		return details.getUsername();
	}

}
