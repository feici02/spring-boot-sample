package com.example.springbootsample;

import com.example.springbootsample.mapper.EmployeeMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class EmployeeMapperTest {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    @DisplayName("mybatis find by id test")
    void test0() {
        int empNo = 10001;
        assertEquals(empNo,
                employeeMapper.findbyId(empNo).getEmpNo());
    }

    @Test
    @DisplayName("mybatis find by wrong id test")
    void test1() {
        int wrongEmpNo = 1001;
        assertNull(employeeMapper.findbyId(wrongEmpNo));
    }
}