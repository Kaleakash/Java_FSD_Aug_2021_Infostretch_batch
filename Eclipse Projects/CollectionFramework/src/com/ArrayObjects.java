package com;

public class ArrayObjects {

	public static void main(String[] args) {
//	Employee emp1 = new Employee();
//	emp1.setId(100);
//	emp1.setName("Raj");
//	emp1.setSalary(12000);
//	System.out.println(emp1.getId());
//	System.out.println(emp1.getName());
//	System.out.println(emp1.getSalary());
//		Employee emp1 = new Employee(101,"Ramesh",15000);
//		System.out.println(emp1.getId());
//		System.out.println(emp1.getName());
//		System.out.println(emp1.getSalary());
//		Employee emp1 = new Employee(101,"Raju",18000);
//		System.out.println(emp1);
		Employee employees[] = new Employee[100];
		employees[0]= new Employee();		// heap memory created add store in zero position 
		employees[0].setId(100);
		employees[0].setName("Raju");
		employees[0].setSalary(15000);
		System.out.println(employees[0].getId());
		System.out.println(employees[0].getName());
		System.out.println(employees[0].getSalary());
		
		employees[1]= new Employee(101,"Ramesh",18000);
		System.out.println(employees[1]);
	}

}
