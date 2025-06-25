package org.example.sobes_tregulov_springboot.controller;


import org.example.sobes_tregulov_springboot.dao.EmployeeDAO;
import org.example.sobes_tregulov_springboot.entity.Employee;
import org.example.sobes_tregulov_springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employess")
    public List<Employee> showAllEmployees() {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employess/{id}")
    public Employee showEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        return employee;
    }

    @PostMapping("/employess")
    public Employee createEmployee(@RequestBody Employee employee) {
        employee = employeeService.
    }




}
