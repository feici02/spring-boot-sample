package com.example.springbootsample.service.impl;

import com.example.springbootsample.entity.Employee;
import com.example.springbootsample.repository.EmployeeRepository;
import com.example.springbootsample.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Primary
@Service
@RequiredArgsConstructor
public class EmployeeServiceJpaImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }
}
