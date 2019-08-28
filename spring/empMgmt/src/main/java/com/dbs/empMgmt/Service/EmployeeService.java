package com.dbs.empMgmt.Service;

import java.util.List;

import com.dbs.empMgmt.Model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	   List<Employee> listAll();

	   Employee findById(long empId);

	   void deleteEmployee(long empId);


}
