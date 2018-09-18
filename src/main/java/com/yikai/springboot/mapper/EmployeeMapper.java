package com.yikai.springboot.mapper;

import com.yikai.springboot.bean.Employee;

/**
 * @Author wangyikai
 * @Date 2018/9/18 - 15:53
 */
//提前要使用@Mapper或者@MapperScan将接口扫描到容器中去
public interface EmployeeMapper {

    public Employee getEmp(Integer id);

    void insert(Employee employee);
}
