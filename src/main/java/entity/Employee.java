package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Employee {
	 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long EmployeeId;
    private String EmployeeFirstName;
    private String EmployeeLastName;
    private String email;
    private int age;
    
    
    @Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeFirstName=" + EmployeeFirstName + ", EmployeeLastName="
				+ EmployeeLastName + ", email=" + email + ", age=" + age + "]";
	}
	
    
    public Employee(Long employeeId, String employeeFirstName, String employeeLastName, String email, int age) {
		super();
		EmployeeId = employeeId;
		EmployeeFirstName = employeeFirstName;
		EmployeeLastName = employeeLastName;
		this.email = email;
		this.age = age;
	}
	
    
    public Long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Long employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return EmployeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		EmployeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return EmployeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		EmployeeLastName = employeeLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}