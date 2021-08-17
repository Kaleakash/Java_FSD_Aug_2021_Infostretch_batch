package com;

public class StringApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="NOAH";			// literal style 
		String s2 = new String("NOAH");	// object creation style 
		System.out.println(s1);
		System.out.println(s2);
			System.out.println(s1.toLowerCase());
		System.out.println(s1);
		StringBuffer sbr= new StringBuffer ("example1");
		System.out.println(sbr);
			System.out.println(sbr.append(" for Java Training"));
		System.out.println(sbr);
		
		StringBuffer sbr1 = new StringBuffer(s1);		// converting String to StringBuffer. 
		
	}

}
