package com.example.springboot.jackson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.hello.TestJackson;

@RestController
public class TestJacksonController {
	
	@RequestMapping("/testjackson")
    public TestJackson index() {
        return new TestJackson("Venkat","??","Arrow Electronics");
    }

}
