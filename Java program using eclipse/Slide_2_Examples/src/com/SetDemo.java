package com;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(100);
	hs.add(400);
	hs.add(200);
	hs.add(200);
	hs.add(500);
	hs.add(600);
	System.out.println(hs);
	hs.remove(200);
	System.out.println(hs);
	}

}
