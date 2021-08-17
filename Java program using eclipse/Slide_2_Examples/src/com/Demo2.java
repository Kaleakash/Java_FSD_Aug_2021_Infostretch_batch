package com;
class Employee {
	private int id;
	private String name;
	Employee() {
		System.out.println("Default or empty constructor");
	}
	Employee(int id, String name){
		this.id = id;
		this.name=name;
	}
	void display() {
		System.out.println("This is display method");
		System.out.println("id is "+this.id);
		System.out.println("name is "+this.name);
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();
		Employee emp1 = new Employee(100, "Ravi");
		emp1.display();
	}

}
