package com.wang.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类
@Table(name = "tb_dept") //指定表名，如果省略默认表名就是Dept
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler"})
public class Dept {

    @Id //这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;
    @Column
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

}
