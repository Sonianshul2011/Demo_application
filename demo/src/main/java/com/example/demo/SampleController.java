package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam @notblank String name) {
        return "Hello, " + name + "!";
    }
    
    @PostMapping("/greet")
    public String greet(@RequestBody @notblank String name) {
        return "Hello, " + name + "!";
    }	
}