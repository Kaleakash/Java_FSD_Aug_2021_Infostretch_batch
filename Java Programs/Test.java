class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		this.id = 123;
		this.name = "Unknown";
		this.salary = 8000;
	}
	Employee(int id) {
		this();
		this.id = id;
	}
	Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	void dis() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}	
}

class Test {
	public static void main(String args[]) {
	Employee emp1 = new Employee();		emp1.dis();
	Employee emp2 = new Employee(100);		emp2.dis();
	Employee emp3 = new Employee(101,"Raju");	emp3.dis();
	//Employee emp4 = new Employee(102,"Ramesh",14000);

	
	}
}