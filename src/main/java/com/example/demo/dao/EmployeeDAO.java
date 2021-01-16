package com.example.demo.dao;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
/*
定义接口，继承自JpaRepository
*/
public interface EmployeeDAO extends JpaRepository<Employee,String> {
    //根据employeeNo和pwd获取employee
    Employee getByEmployeeNoAndPwd(String employeeNo, String pwd);
    Employee findByEmployeeNo(String employNo);


}
