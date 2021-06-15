package com.wang.controller;

import com.wang.entity.Dept;
import com.wang.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DeptRepository deptDao;

    @GetMapping("/dept/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id){
        return deptDao.getById(id);
    }

}
