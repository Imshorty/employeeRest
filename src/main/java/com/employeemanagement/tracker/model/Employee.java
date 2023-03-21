package com.employeemanagement.tracker.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="employee")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "employee_id", nullable = false)
        private Employee employee;

        @Column(nullable = false)
        private LocalDate date;

        @Column(nullable = false)
        private LocalTime startTime;

        @Column(nullable = false)
        private LocalTime endTime;

        public Employee(int i, String s, double v) {
        }

        public Employee(Long id, Employee employee, LocalDate date, LocalTime startTime, LocalTime endTime) {
                this.id = id;
                this.employee = employee;
                this.date = date;
                this.startTime = startTime;
                this.endTime = endTime;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public Employee getEmployee() {
                return employee;
        }

        public void setEmployee(Employee employee) {
                this.employee = employee;
        }

        public LocalDate getDate() {
                return date;
        }

        public void setDate(LocalDate date) {
                this.date = date;
        }

        public LocalTime getStartTime() {
                return startTime;
        }

        public void setStartTime(LocalTime startTime) {
                this.startTime = startTime;
        }

        public LocalTime getEndTime() {
                return endTime;
        }

        public void setEndTime(LocalTime endTime) {
                this.endTime = endTime;
        }
}

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="emp_name")
    private String name;
    @Column(name="worked_hours")
    private Double workedHours;

    public Employee() {
    }

    public Employee(Integer id, String name, Double workedHours) {
        this.id = id;
        this.name = name;
        this.workedHours = workedHours;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Double workedHours) {
        this.workedHours = workedHours;
    }*/

