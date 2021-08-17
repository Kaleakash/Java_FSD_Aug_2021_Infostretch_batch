package com;
public class Demo1 {
	public static void work(){
		System.out.println("Welcomes everyone");
	}
	public int welcome(int a,int b){
		int i=0;
		for(i=a;i<b;i++){
		System.out.println(i);}
		return i; 
		}
	public void add(int a,int b) {
			System.out.println("two int parameter method called.");
	}
	public void add(int a, int b, int c) {
		System.out.println("three int parameter method called.");
	}
	public void add(String a,String b) {
		System.out.println("two string parameter method called.");
	}
	public static void main(String[] args) {
		work();
		Demo1 obj = new Demo1();
		int result = obj.welcome(2, 5);
		System.out.println("result "+result);
		obj.add(1, 2, 3);
		obj.add(1, 2);
		obj.add("A","B");
	}
	

	
}
