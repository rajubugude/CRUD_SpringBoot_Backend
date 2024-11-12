package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SampleController {
    @GetMapping(path = "/fetchUser")
    public String userDetails(
            @RequestParam (name = "firstName") String firstName,
            @RequestParam (name = "lasttName", required = false) String lastName,
            @RequestParam (name = "age") int age){
        return "fetching and returning "+firstName + " "+lastName+ " "+age;
    }
}
