package com.wang.mapper;

import com.wang.pojo.Department;
import org.apache.ibatis.annotations.*;

public interface DepartmentMapper1 {

    public Department getDepartment1ById(Integer id);

}
