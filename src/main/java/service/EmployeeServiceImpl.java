package service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Employee;
import repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService 
{

							@Autowired
							private EmployeeRepository employeeRepository;
							
							
							
							// Save operation
							@Override
							public Employee saveEmployee(Employee employee)
							{
							    return employeeRepository.save(employee);
							}
							
							
							// Read operation
							@Override public List<Employee> fetchEmployeeList()
							{
							    return (List<Employee>)
							    		employeeRepository.findAll();
							}
							
							
							
							// Update operation
							@Override
							public Employee updateEmployee(Employee employee, Long EmployeeId)
							{
							
								Employee empDB = employeeRepository.findById(EmployeeId).get();
							
							    if (Objects.nonNull(employee.getEmployeeFirstName()) && !"".equalsIgnoreCase(employee.getEmployeeFirstName())) 
							    {
							    	empDB.setEmployeeFirstName(employee.getEmployeeFirstName());
							    }
							
							    if (Objects.nonNull(employee.getEmployeeLastName()) && !"".equalsIgnoreCase(employee.getEmployeeLastName())) 
							    {
							    	empDB.setEmployeeLastName(employee.getEmployeeLastName());
							    }
							
							    if (Objects.nonNull(employee.getEmail())&& !"".equalsIgnoreCase(employee.getEmail())) 
							    {
							    	empDB.setEmail(employee.getEmail());
							    }
							    
							    if (Objects.nonNull(employee.getAge())&& !"".equals(employee.getAge())) 
							    {
							    	empDB.setAge(employee.getAge());
							    }
							
							    return employeeRepository.save(empDB);
							}
							
							
							
							// Delete operation
							@Override
							public void deleteEmployeeById(Long EmployeeId)
							{
								employeeRepository.deleteById(EmployeeId);
							}
				}