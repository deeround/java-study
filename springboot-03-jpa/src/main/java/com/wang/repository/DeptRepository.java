package com.wang.repository;

import com.wang.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//继承JpaRepository来完成对数据库的操作
public interface DeptRepository extends JpaRepository<Dept,Integer> {

}
