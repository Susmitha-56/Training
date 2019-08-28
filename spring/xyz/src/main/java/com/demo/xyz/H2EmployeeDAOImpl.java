package com.demo.xyz;

import com.dbs.emp_mgmt.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@Repository("h2Dao")
public class H2EmployeeDAOImpl implements EmployeeDAO {


    @Autowired
    public H2EmployeeDAOImpl(JdbcTemplate jdbcTemplate){
    }

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(long empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
	}

	 <bean depends-on="emp_db"
	          class="org.springframework.beans.factory.config.MethodInvokingBean">
	        <property name="targetClass"
	                  value="org.hsqldb.util.DatabaseManagerSwing" />
	        <property name="targetMethod" value="main" />
	        <property name="arguments">
	            <list>
	                <value>--url</value>
	                <value>jdbc:h2:mem:emp_db</value>
	                <value>--user</value>
	                <value>sa</value>
	                <value>--password</value>
	                <value></value>
	            </list>
	        </property>
	    </bean>
}