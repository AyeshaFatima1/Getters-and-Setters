package com.setterAndToStringMethod;

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
//to string method
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

//main
public static void main(String[] args) {
	
	Employee employee=new Employee();
	
	//setting values using setter methods
	employee.setId(6734);
	employee.setName("Sana");
	employee.setSalary(78523.89);
	//printing values on the screen using toString method
	System.out.println(employee.toString());
	
	//System.out.println(employee);
	
}

}