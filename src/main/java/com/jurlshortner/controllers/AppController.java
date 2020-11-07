package com.jurlshortner.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("hello world");
	}

}
