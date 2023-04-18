package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import entity.Employee;
import service.EmployeeService;

public class EmployeeController 
{
	 
				    @Autowired 
				    private EmployeeService employeeService;
				 
				    
				    // Save operation
				    @PostMapping("/employee")
				 
				    public Employee saveEmployee(@RequestBody Employee employee)
				    {
				        return employeeService.saveEmployee(employee);
				    }
				 
				    
				    
				    // Read operation
				    @GetMapping("/employees")
				 
				    public List<Employee> fetchEmployeeList()
				    {
				        return employeeService.fetchEmployeeList();
				    }
				 
				    
				    
				    // Update operation
				    @PutMapping("/employees/{id}")
				 
				    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id") Long EmployeeId)
				    {
				        return employeeService.updateEmployee(employee, EmployeeId);
				    }
				 
				    
				    
				    // Delete operation
				    @DeleteMapping("/employees/{id}")
				 
				    public String deleteDepartmentById(@PathVariable("id") Long EmployeeId)
				    {
				    	employeeService.deleteEmployeeById(EmployeeId);
				        return "Deleted Successfully";
				    }
}