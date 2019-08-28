package com.dbs.empMgmt.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.dbs.empMgmt.Model.Employee;

@Repository
public class InMemoryEmployeeDAO implements EmployeeDao{

	
	private static final List<Employee> empList=new ArrayList<Employee>();
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Inside the save method ....");
		empList.add(employee);
		return employee;
	}

	public Employee update(long empid, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> optionalEmp= empList.stream().filter(emp ->emp.getId()== empid).findFirst();
		optionalEmp.ifPresent(employee1 -> empList.add(empList.indexOf(employee), employee));
		return employee;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empList;
	}

	 public Employee findById(long id) {
	        Optional<Employee> optionalEmployee = empList.stream().filter(employee -> employee.getId() == id).findFirst();
	        if(optionalEmployee.isPresent()){
	            return optionalEmployee.get();
	        }
	        return null;
	    }

	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		empList.removeIf(employee -> employee.getId() == id);
		
	}

}
