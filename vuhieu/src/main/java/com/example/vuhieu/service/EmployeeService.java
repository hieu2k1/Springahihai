package com.example.vuhieu.service;

import com.example.vuhieu.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll();

    EmployeeEntity createEmployee(EmployeeEntity e);
    void deleteEmployee(int id);
    EmployeeEntity updateEmployee(EmployeeEntity e);
    List<EmployeeEntity> getEmployeeByName(String name);

}
