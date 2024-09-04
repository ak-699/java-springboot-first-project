package com.FirstSpringProject.FirstSpringProject;

import org.springframework.web.bind.annotation.*;

// Restcontroller = Controller + ResponseBody
@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public HelloResponse hello(@PathVariable String name) {
        return new HelloResponse("Hello "+name);
    }

    @PostMapping("/hello")
    public HelloResponse sayHello(@RequestBody String name) {
        return new HelloResponse("Hello " + name);
    }
    // returning object automatically converted the response to json response
    // conversion is handled by spring using message converter
    // handled by jackson library
}
