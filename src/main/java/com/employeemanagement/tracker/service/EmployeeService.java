package com.employeemanagement.tracker.service;

import com.employeemanagement.tracker.model.Employee;

import java.util.List;


public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(Long id);
    public void delete(Long id);

}
