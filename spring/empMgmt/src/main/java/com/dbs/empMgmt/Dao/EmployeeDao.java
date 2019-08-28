package com.dbs.empMgmt.Dao;

import java.util.List;

import com.dbs.empMgmt.Model.Employee;

public interface EmployeeDao {

	Employee save(Employee employee);
	Employee update(long empid, Employee employee);
	List<Employee> findAll();
	Employee findById(long id);
	void deleteEmployee(long id);
}
