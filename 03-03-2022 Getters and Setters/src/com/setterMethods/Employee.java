package com.setterMethods;

public class Employee {

	int id;
	String name;
	double salary;

public Employee() {
	
 }
//setter methods
public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setSalary(double salary) {
	this.salary = salary;
}
//method
public void getEmployeeInfo() {
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(salary);
}
//main
public static void main(String[] args) {
	
	Employee employee=new Employee();
	
	//setting values using setter methods
	employee.setId(3478);
	employee.setName("Ayesha");
	employee.setSalary(34123.89);
	
	employee.getEmployeeInfo();
}

}