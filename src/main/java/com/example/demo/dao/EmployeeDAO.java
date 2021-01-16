package com.example.demo.dao;

import com.example.demo.pojo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
/*
定义接口，继承自JpaRepository
*/
public interface EmployeeDAO extends JpaRepository<Employee,String> {

    Employee getByEmployeeNoAndPwd(String employeeNo, String pwd);
}
