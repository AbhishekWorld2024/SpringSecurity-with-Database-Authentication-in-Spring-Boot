package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;


@Repository
public interface Detailsrepository extends JpaRepository<Userdetails,Integer>{
Userdetails findByUsername(String username);

}
