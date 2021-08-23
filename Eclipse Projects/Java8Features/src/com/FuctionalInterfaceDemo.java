package com;
@FunctionalInterface
interface A {
	void dis1();
	default void dis2() {}
	static void dis3() {}
	default void dis4() {}
	static void dis5() {}
}
public class FuctionalInterfaceDemo {

	public static void main(String[] args) {


	}

}
