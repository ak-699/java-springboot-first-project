package com.FirstSpringProject.FirstSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Restcontroller = Controller + ResponseBody
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello abhishek";
    }
}
