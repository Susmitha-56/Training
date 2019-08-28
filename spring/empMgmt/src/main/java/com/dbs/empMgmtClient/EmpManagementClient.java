package com.dbs.empMgmtClient;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.empMgmt.Controller.EmployeeController;
import com.dbs.empMgmt.Model.Employee;

public class EmpManagementClient {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeController empc=context.getBean(EmployeeController.class);
		 Employee employee = new Employee(12,"Harish", LocalDate.of(1985,5, 25));

	        empc.saveEmployee(employee);

	}

}
