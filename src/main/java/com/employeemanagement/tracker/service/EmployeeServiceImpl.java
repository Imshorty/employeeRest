package com.employeemanagement.tracker.service;

import com.employeemanagement.tracker.model.Employee;
import com.employeemanagement.tracker.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Profile("!mock")
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>)employeeRepo.findAll();
    }


    @Override
    public Employee getEmployeeById(Long id) {

        return employeeRepo.findById(id).get();
    }


    @Override
    public void delete(Long id) {
        employeeRepo.deleteById(id);;

    }
}
