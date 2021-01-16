package com.example.demo.service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
    业务逻辑
*/

@Service
public class EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;

/*    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }*/

/*    public User getByName(String username) {
        return userDAO.findByEmployeeNo(username);
    }*/

    public Employee get(String employeeNo, String pwd){
        return employeeDAO.getByEmployeeNoAndPwd(employeeNo, pwd);
    }

    public void add(Employee employee) {
        employeeDAO.save(employee);
    }
}
