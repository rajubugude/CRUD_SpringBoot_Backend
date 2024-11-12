package com.example.demo.controllers;



import com.example.demo.dto.EmployeeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

//@RestController
@Controller
public class EmployeeController {
    @GetMapping(path="/employees")
    @ResponseBody
    public EmployeeDTO getEmployees(){
        return new EmployeeDTO(121,
                "asdf",
                LocalDate.of(2024, Month.OCTOBER,5),
                true);
    }

}

