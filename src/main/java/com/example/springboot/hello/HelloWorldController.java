package com.example.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from spring boot! Modified to check Hot Swap";
    }

}
