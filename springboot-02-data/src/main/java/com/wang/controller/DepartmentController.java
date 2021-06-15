package com.wang.controller;

import com.wang.mapper.DepartmentMapper;
import com.wang.mapper.DepartmentMapper1;
import com.wang.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    DepartmentMapper1 departmentMapper1;

    @GetMapping("/dept1/{id}")
    public Department getDepartment1(@PathVariable("id") Integer id){
        Department department = departmentMapper1.getDepartment1ById(id);
        return department;
    }

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        Department department = departmentMapper.getDepartmentById(id);
        return department;
    }

    @GetMapping("/dept")
    public Department insertDepartment(Department department){
        departmentMapper.insertDepartment(department);
        return department;
    }
}
