package com.wipro.Collections.List.Question2;

public class MainTest {

		public static void main(String[] args) {
			EmployeeDB empDb = new EmployeeDB();
			
			Employee emp1 = new Employee(101, "Sai", "sai123@gmail.com", 'M', 25000);
			Employee emp2 = new Employee(102, "Chandra", "chandra123@gmail.com", 'F', 30000);
			Employee emp3 = new Employee(103, "Sukhesh", "sukhesh123@gmail.com", 'M', 20000);
			Employee emp4 = new Employee(104, "Ram", "ram123@gmail.com", 'M', 50000);
			
			empDb.addEmployee(emp1);
			empDb.addEmployee(emp2);
			empDb.addEmployee(emp3);
			empDb.addEmployee(emp4);

			for (Employee emp : empDb.listAll())
				System.out.println(emp.GetEmployeeDetails());
			
			System.out.println();
			empDb.deleteEmployee(102);
			
			for (Employee emp : empDb.listAll())
				System.out.println(emp.GetEmployeeDetails());
			
			System.out.println();
			
			System.out.println(empDb.showPaySlip(103));
		}

	}

