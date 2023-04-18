package service;

import java.util.List;

import entity.Employee;

public interface EmployeeService {
	
	
	// Save operation
	Employee saveEmployee(Employee employee);
 
    // Read operation
    List<Employee> fetchEmployeeList();
 
    // Update operation
    Employee updateEmployee(Employee employee,
                                Long EmployeeId);
 
    // Delete operation
    void deleteEmployeeById(Long EmployeeId);

}
