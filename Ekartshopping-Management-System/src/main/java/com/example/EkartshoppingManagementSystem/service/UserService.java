package com.example.EkartshoppingManagementSystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.EkartshoppingManagementSystem.dto.UserRegistrationDto;
import com.example.EkartshoppingManagementSystem.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
