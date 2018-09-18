package com.yikai.springboot.mapper;

import com.yikai.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author wangyikai
 * @Date 2018/9/18 - 15:12
 */
//指定这是一个操作数据库的Mapper
//@Mapper
public interface DepartmentMapper {


    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insert(Department department);

    @Update("update department set department_name=#{departmentName} where id = #{id}")
    public int update(Department department);
}
