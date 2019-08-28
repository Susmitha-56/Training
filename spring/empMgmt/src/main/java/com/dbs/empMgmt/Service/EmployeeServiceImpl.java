package com.dbs.empMgmt.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.empMgmt.Dao.EmployeeDao;
import com.dbs.empMgmt.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDAO;
	
	@Autowired
	private EmployeeServiceImpl(EmployeeDao employeeDAO)
	{
		this.employeeDAO=employeeDAO;
	}

	  @Override
	    public Employee saveEmployee(Employee employee) {
	        return employeeDAO.save(employee);
	    }

	    @Override
	    public List<Employee> listAll() {
	        return this.employeeDAO.findAll();
	    }

	    @Override
	    public Employee findById(long empId)  {
	        return this.employeeDAO.findById(empId);
	    }

	    @Override
	    public void deleteEmployee(long empId) {
	        this.employeeDAO.deleteEmployee(empId);
	    }
	
	

}
