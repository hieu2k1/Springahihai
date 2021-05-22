package com.example.vuhieu.service;


import com.example.vuhieu.entity.EmployeeEntity;
import com.example.vuhieu.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeEntity> getAll() {
        return EmployeeRepo.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity e) {
        return employeeRepo.save(e);
    }

    @Override
    public void deleteEmployee(int id) {
        EmployeeRepo.deleteById(id);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity e) {
        return employeeRepo.save(e);
    }

    @Override
    public List<EmployeeEntity> getEmployeeByName(String name) {
        List<EmployeeEntity> list = employeeRepo.findEmployeeByNameCustom(name);
        return list;
    }
}