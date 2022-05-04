package com.example.springbootsample.service.impl;

import com.example.springbootsample.entity.Employee;
import com.example.springbootsample.mapper.EmployeeMapper;
import com.example.springbootsample.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
// @Primary
@Service
@RequiredArgsConstructor
public class EmployeeServiceMybatisImpl implements EmployeeService {
    private final EmployeeMapper employeeMapper;

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        log.info("id: {}", id);
        return Optional.of(employeeMapper.findbyId(id));
    }
}
