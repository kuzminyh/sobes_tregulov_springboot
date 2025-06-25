package org.example.sobes_tregulov_springboot.service;

import org.example.sobes_tregulov_springboot.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void saveEmployee(Employee employee);
}
