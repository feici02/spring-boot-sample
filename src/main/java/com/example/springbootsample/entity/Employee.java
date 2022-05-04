package com.example.springbootsample.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    Integer empNo;
    @JsonIgnore
    Date birthDate;
    String firstName;
    String lastName;
    @Enumerated(EnumType.STRING)
    Gender gender;
    Date hireDate;
}
