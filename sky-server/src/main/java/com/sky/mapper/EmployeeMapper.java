package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("SELECT  * FROM employee WHERE username = #{username}")
    Employee getByUsername(String username);

    /**
     * 根据用户名查询员工
     * @param employee
     */
    @Insert("INSERT INTO employee(name, username, password, phone, sex, id_number, status, create_time, update_time, create_user, update_user)"
            +
            "VALUES(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{status},now(),now(),#{createUser},#{updateUser})")
    void insert(Employee employee);
}
