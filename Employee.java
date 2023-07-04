package com.acn.inheritance;

public class Employee extends Person{
	private int empId;
	private double salary;
	private int performancerating;
	
	public Employee()
	{
		super();
		empId=123;
		salary=50000;
		performancerating=8;
	}
	
	public Employee(int empId,double salary,int performancerating)
	{
		super("preethi","lakshmi",56);
		this.empId=empId;
		this.salary=salary;
		this.performancerating=performancerating;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPerformancerating() {
		return performancerating;
	}

	public void setPerformancerating(int performancerating) {
		this.performancerating = performancerating;
	}
	
	public void printEmployeeDetails()
	{
		System.out.println("FirstName:"+getFirstName());
		System.out.println("LastName:"+getLastName());
		System.out.println("age:"+getAge());
		System.out.println("Empid:"+getEmpId());
		System.out.println("Salary:"+getSalary());
		System.out.println("Performance Rating:"+getPerformancerating());
		
	}
}
