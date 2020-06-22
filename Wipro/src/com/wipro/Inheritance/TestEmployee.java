package com.wipro.Inheritance;

class Person
{
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Person(String name)
	{
		this.name=name;
	}
}

class Employee extends Person
{
	double annualSalary;
	int year;
	int insuranceNumber;
	
	Employee(String name,double annualSalary,int year,int insuranceNumber)
	{
		super(name);
		this.annualSalary=annualSalary;
		this.year=year;
		this.insuranceNumber=insuranceNumber;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
}

public class TestEmployee {
public static void main(String[] args) {
	Employee e=new Employee("Sai",10000.0,2020,123456789);
	System.out.println(e.getName());
	System.out.println(e.getAnnualSalary());
	System.out.println(e.getYear());
	System.out.println(e.getInsuranceNumber());
	
	
}
}
