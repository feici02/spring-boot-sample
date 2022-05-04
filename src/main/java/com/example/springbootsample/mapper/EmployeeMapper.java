package com.example.springbootsample.mapper;

import com.example.springbootsample.entity.Employee;
import org.apache.ibatis.annotations.Select;

// @Mapper
public interface EmployeeMapper {
    @Select("select * from employees where emp_no=#{empNo}")
    Employee findbyId(Integer empNo);
}
