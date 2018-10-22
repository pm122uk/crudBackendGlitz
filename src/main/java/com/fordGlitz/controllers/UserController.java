package com.fordGlitz.controllers;

import com.fordGlitz.entities.User;

import java.util.List;
import java.util.Optional;

import com.fordGlitz.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class UserController
{
		
	   @Autowired
	    private UserRepository userRepository;  

		@GetMapping("/users")
		public List<User> getUsers() {
			return userRepository.findAll();
		}

		@GetMapping("/user/{id}")
		public Optional<User> getUser(@PathVariable Long id) {
			return userRepository.findById(id);
		}

		@DeleteMapping("/user/{id}")
		public boolean deleteUser(@PathVariable Long id) {
			userRepository.deleteById(id);
			return true;
		}

		@PutMapping("/user")
		public User updateUser( User user) {
			return userRepository.save(user);
		}

		@PostMapping("/user")
		public User createUser(User user) {
			return userRepository.save(user);
		}
	
	
}

