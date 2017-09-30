package com.su.dao;

import java.util.List;

import com.su.model.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public void deleteEmployee(Integer employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee getEmployee(int employeeid);
}
