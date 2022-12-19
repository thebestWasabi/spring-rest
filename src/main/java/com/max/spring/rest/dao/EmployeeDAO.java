package com.max.spring.rest.dao;

import com.max.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
