package com.yikai.springboot.controller;

import com.yikai.springboot.bean.Department;
import com.yikai.springboot.bean.Employee;
import com.yikai.springboot.mapper.DepartmentMapper;
import com.yikai.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangyikai
 * @Date 2018/9/18 - 15:22
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insert(Department department){
        departmentMapper.insert(department);
        return  department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmp(id);
    }
}
