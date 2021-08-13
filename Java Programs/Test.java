class Abc {
	int a;
	String msg;
	void dis1() {
		float b=123;
		System.out.println(a);
		System.out.println(msg);
		System.out.println(b);
	}
	void dis2() {
		char c='+';
		System.out.println(a);
		System.out.println(msg);
		System.out.println(c);
	}
}
class Test {
	public static void main(String args[]) {
	Abc obj1 = new Abc();
	obj1.dis1();
	obj1.dis2();
	}
}