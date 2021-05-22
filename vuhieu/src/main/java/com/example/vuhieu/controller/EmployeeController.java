package com.example.vuhieu.controller;


import com.example.vuhieu.entity.EmployeeEntity;
import com.example.vuhieu.model.BaseResponse;
import com.example.vuhieu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getEmployee(@RequestParam(value = "name", required = false) String name) {
        BaseResponse res = new BaseResponse();
        if (name != null) {
            res.data = employeeService.getEmployeeByName(name);
        } else {
            res.data = employeeService.getAll();
        }
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody EmployeeEntity e) {
        EmployeeEntity data = (EmployeeEntity) employeeService.createEmployee(e);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody EmployeeEntity e) {
        EmployeeEntity data = employeeService.updateEmployee(e);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEmployee(@PathVariable("id") int id) {
        BaseResponse res = new BaseResponse();
        EmployeeService.deleteEmployee(id);
        return ResponseEntity.ok(res);
    }
}