package com.dbs.empMgmt.Controller;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.empMgmt.Model.Employee;
import com.dbs.empMgmt.Service.EmployeeService;


import java.util.List;

@Component
public class EmployeeController {

	private EmployeeService employeeService;
	
	
	@Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    public Employee saveEmployee(Employee employee){
        return this.employeeService.saveEmployee(employee);
    }

    public List<Employee> listAll(){
        return this.employeeService.listAll();
    }

    public Employee findById(long empId){
        return this.employeeService.findById(empId);
    }

    public void deleteEmployee(long empId){
        this.employeeService.deleteEmployee(empId);
    }
}
