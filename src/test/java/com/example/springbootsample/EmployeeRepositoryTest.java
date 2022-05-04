package com.example.springbootsample;

import com.example.springbootsample.repository.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    @DisplayName("jpa find by id test")
    void test0() {
        int id = 10001;
        employeeRepository.findById(id)
                .ifPresent(employee -> assertEquals(id, employee.getEmpNo()));
    }

    @Test
    @DisplayName("jpa find by wrong id test")
    void test1() {
        int wrongId = 1001;
        assertThat(employeeRepository.findById(wrongId)).isEmpty();
    }
}