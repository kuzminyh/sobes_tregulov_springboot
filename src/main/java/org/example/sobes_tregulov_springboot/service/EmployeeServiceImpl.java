package org.example.sobes_tregulov_springboot.service;

import org.example.sobes_tregulov_springboot.dao.EmployeeDAO;
import org.example.sobes_tregulov_springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }
}
