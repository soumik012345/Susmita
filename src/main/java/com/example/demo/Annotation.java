package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Annotation {
	
	@GetMapping("/user/{name}/{age}")

 public String print(@PathVariable("name")String name, @PathVariable("age")String age){
		return "my name is& age " +name+"my age is "+age;
		
	}
	@PostMapping("/post/user")
	public String post(@RequestBody User user) {
		System.out.println(user);
		return "success";
	}

}

