import java.io.*;
class Employee implements Serializable{
	int id;
	String name;
	float salary;
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name =name;
		this.salary = salary;
	}
	void dis() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);						
	}
}
class Test {
	public static void main(String args[])  throws Exception{
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee ee = (Employee)ois.readObject();
		ee.dis();
		System.out.println("Object De-Serializaton done successfully");

		/*Employee emp = new Employee(100,"Raj",12000);
		emp.dis();	
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("Object serilization done successfully...");*/
		
	}
}	