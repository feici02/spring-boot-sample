package com.example.springbootsample.service;

import com.example.springbootsample.entity.Employee;

import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> getEmployeeById(int id);
}
