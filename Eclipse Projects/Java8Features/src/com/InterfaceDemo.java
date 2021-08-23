package com;
interface Abc {
	void dis1();
	default void gst() {
		System.out.println("Default implementation");
	}
	default void dis2() {
		System.out.println("This is default dis2 metthod in interface");
	}
	default void dis3() {
		System.out.println("This is default dis3 method in interface");
	}
	static void dis4() {
		System.out.println("This is static method in interface");
	}
		
}
class Demo implements Abc {
	public void dis1() {
		System.out.println("dis1 method override by Demo class");
	}
	public void dis3() {
		System.out.println("dsi3() method override by Demo class");
	}
//	public static void dis4() {
//		System.out.println("This is static method ");
//	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.dis1();
		obj.dis2();
		obj.dis3();
		//obj.dis4();		// we can't call static method which belong interface through sub class object 
		Abc.dis4();			// static method belong interface must be access through interface name.
	}

}
