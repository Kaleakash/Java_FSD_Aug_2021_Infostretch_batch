package com;
class Outer {
	int a;
	void dis1() {
		System.out.println("This is outer class method");
		//Inner in = new Inner();
		///in.dis2();
	}
	class Inner {
		void dis2() {
			System.out.println("This is inner class method");
		}
	}
	static class StaticInner {
		void dis3() {
			System.out.println("This is static inner class");
		}
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
	Outer out = new Outer();
	out.dis1();
	Outer.Inner in = new Outer().new Inner();		// object for non static inner class 
	in.dis2();
	Outer.StaticInner in1 = new Outer.StaticInner();		// object for static inner class 
	in1.dis3();
	}
}

/*
 static inner 
 non static inner 
 local class (inside a method) 
 anonymous inner class 
 
 */
