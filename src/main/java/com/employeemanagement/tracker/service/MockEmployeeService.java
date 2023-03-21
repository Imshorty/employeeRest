package com.employeemanagement.tracker.service;

import com.employeemanagement.tracker.model.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("mock")
@Service
public class MockEmployeeService implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public MockEmployeeService() {
        employees.add(new Employee(10, "john.doe@example.com", 40.0));
        employees.add(new Employee(11, "jane.smith@example.com", 30.0));
        employees.add(new Employee(12, "bob.johnson@example.com", 35.0));
    }



    @Override
    public Employee saveEmployee(Employee employee) {
        return employee;

    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id) {

        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
