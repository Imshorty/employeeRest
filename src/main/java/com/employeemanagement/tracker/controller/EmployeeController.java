package com.employeemanagement.tracker.controller;

import com.employeemanagement.tracker.model.Employee;
import com.employeemanagement.tracker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        Employee eid=employeeService.saveEmployee(employee);
        return new ResponseEntity<String>("Employee" + eid + "has been saved", HttpStatus.OK);
    }

    @GetMapping("/employeeList")
    public ResponseEntity<List<Employee>> getAllEmployeeDetails() {
        List<Employee> employeeList = employeeService.getAllEmployee();
        return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);

    }

    @GetMapping("/get")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<String> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        Employee employeeDb = employeeService.getEmployeeById(id);
        employeeDb.setId(employee.getId());
        employeeDb.setDate(employee.getDate());
        employeeDb.setStartTime(employee.getStartTime());
        employeeDb.setEndTime(employee.getEndTime());
        employeeService.saveEmployee(employeeDb);
        return new ResponseEntity<String>("Employee" + id + "has been updated", HttpStatus.OK);

    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.delete(id);
        return new ResponseEntity<String>("Employee" + id + " has been deleted", HttpStatus.OK);
    }
}
