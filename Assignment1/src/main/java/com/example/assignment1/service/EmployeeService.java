package com.example.assignment1.service;

import com.example.assignment1.model.Address;
import com.example.assignment1.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employeesList = new ArrayList<>();

    public List<Employee> getAllEmployees() {

        Employee employee1 = new Employee(1, "Tony", "Sorpano", "Boss",
                new Address(14, "Aspen", "Caldwell", 07061, "New Jersey", "United States"), 2012641111);
        Employee employee2 = new Employee(2, "Silvio", "Dante", "Consigliere",
                new Address(14, "BadaBing Road", "Belleville", 07025, "New Jersey", "United States"), 2012542121);
        Employee employee3 = new Employee(3, "Paulie", "Gaultieri", "Underboss",
                new Address(14, "Ohhhhh Boulevard", "Clifton", 07512, "New Jersey", "United States"), 2012353452);
        Employee employee4 = new Employee(4, "Christopher", "Moltisanti", "Captain",
                new Address(14, "Heroin Drive", "East Brunswick", 07121, "New Jersey", "United States"), 2012451256);
        Employee employee5 = new Employee(5, "Bobby", "Baccalieri", "Underboss",
                new Address(14, "Food-Court Str", "Harrison", 07221, "New Jersey", "United States"), 2012435367);
        Employee employee6 = new Employee(6, "Ralph", "Cifaretto", "Captain",
                new Address(14, "Gladiator Place", "North Bergen", 07331, "New Jersey", "United States"), 2012422355);
        Employee employee7 = new Employee(7, "Vito", "Spatafore", "Captain",
                new Address(14, "In The Closet Avenue", "Newark", 075161, "New Jersey", "United States"), 201419824);

        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);
        employeesList.add(employee4);
        employeesList.add(employee5);
        employeesList.add(employee6);
        employeesList.add(employee7);

        return employeesList;
    }

    public Employee getEmployeeById(int employeeId){
        for(Employee employee : employeesList){
            if (employee.getEmployeeId() == employeeId){
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }
}
