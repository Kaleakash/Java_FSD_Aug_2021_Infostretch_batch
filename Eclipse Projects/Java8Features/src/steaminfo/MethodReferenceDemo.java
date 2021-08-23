package steaminfo;
interface A {
	void dis1();
}
class B {
	public static void dis1() {
		System.out.println("This is simple method reference");
	}
}
public class MethodReferenceDemo {
	public static void main(String[] args) {
		A obj1 = B :: dis1;				
		obj1.dis1();
		
		A obj2 = ()->System.out.println("This is lambda expression");
		obj2.dis1();
	}
	
}
