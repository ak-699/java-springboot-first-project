package com.FirstSpringProject.FirstSpringProject;

import org.springframework.web.bind.annotation.*;

// Restcontroller = Controller + ResponseBody
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello abhishek";
    }

    @PostMapping("/hello")
    public String sayHello(@RequestBody String name) {
        return "Hello " + name;
    }
}
