package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //添加
    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
    @PostMapping("/api/employee/add")
    public int addEmployee(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    //根据employeeNo删除
    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
    @PostMapping("/api/employee/delete")
    public int delEmployee(@RequestBody Employee employee){
        return employeeService.delete(employee.getEmployeeNo());
    }

    //根据employeeNo查询
    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
    @PostMapping(value = "/api/employee/search",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;"})
    public Employee search(@RequestBody Employee employee){
        System.out.println(employee.getEmployeeNo());
        return employeeService.search(employee.getEmployeeNo());
    }

}
