package com.example.assignment1.api;

import com.example.assignment1.model.Employee;
import com.example.assignment1.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {

    EmployeeService empService = new EmployeeService();

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        return empService.getEmployeeById(employeeId);
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        empService.addEmployee(employee);
        return employee;
    }
}