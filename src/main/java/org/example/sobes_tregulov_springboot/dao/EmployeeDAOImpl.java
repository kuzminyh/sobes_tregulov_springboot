package org.example.sobes_tregulov_springboot.dao;


import jakarta.persistence.EntityManager;

import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.example.sobes_tregulov_springboot.entity.Employee;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

//        Session session = entityManager.unwrap(Session.class);  //развернуть обёртку unwrap
//        Query<Employee> query = session.createQuery("from Employee", Employee.class);
//        List<Employee> allEmloyees = query.getResultList();
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmloyees = query.getResultList();

        return allEmloyees;
    }

    @Override
    public Employee getEmployee(int id) {

        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public void saveEmployee(Employee employee) {
      Employee employee1 =  entityManager.merge(employee);
      employee.setId(employee1.getId());

    }

    @Override
    public void deleteEmployee(int id) {
         Query query = entityManager.createQuery("delete from Employee where id=:id");
         query.setParameter("id", id);
         query.executeUpdate();
    }
}
