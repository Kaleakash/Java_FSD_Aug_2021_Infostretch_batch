class Car {
	int wheel;
	float price;
	String color;
	void start() {
		System.out.println("Car Start");
	}
	void appliedGear() {
		System.out.println("Applied Gear");

	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car Stop");
	}
}
class CarTest {
	public static void main(String args[]) {
	//System.out.println("Main method");
	Car innova = new Car();		// one heap memory created..
	innova.start();
	innova.stop();
	}
}