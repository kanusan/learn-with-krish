package com.kanu.training.salesmanager.repository;

import java.util.List;

import com.kanu.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}