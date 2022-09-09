package com.kanu.training.salesmanager.service;

import java.util.List;

import com.kanu.training.salesmanager.model.Employee;
import com.kanu.training.salesmanager.repository.EmployeeRepository;
import com.kanu.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository =  (EmployeeRepository) new HibernateEmployeeRepositoryImpl();
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
}
