package com;
interface Test {
	void dis1();
}
// 1st way 
class TestApp implements Test {
	public void dis1() {
		System.out.println("dis1 method override by TestApp class");
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
	//1st Way 
	Test t1 = new TestApp();
	t1.dis1();
	// 2nd way 
	//Anonymous inner class 
	Test t2 = new Test()  {
				public void dis1() {
					System.out.println("dis1 method override by Anonymous inner class");
				}
		};
	t2.dis1();
	// 3rd way using interface. 
	// Lambda expression is known as anonymous method or function. 
	Test t3 = ()->System.out.println("This is lambda expression");
	t3.dis1();
	}

}
