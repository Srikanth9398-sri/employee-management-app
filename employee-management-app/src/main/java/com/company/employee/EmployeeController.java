package com.company.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String home() {
        return "Employee Management App is running!";
    }

    @GetMapping("/employees")
    public List<String> getEmployees() {
        return List.of(
                "Srikanth",
                "Rahul",
                "Anjali",
                "Priya"
        );
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
