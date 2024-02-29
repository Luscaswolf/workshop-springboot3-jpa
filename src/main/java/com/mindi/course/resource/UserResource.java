package com.mindi.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindi.course.entites.User;

@RestController
@RequestMapping("/user")
	public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User(1L, "Lucas", "Lucas@gmail.com", "9999999", "123");
		return ResponseEntity.ok().body(u);
	}

}
