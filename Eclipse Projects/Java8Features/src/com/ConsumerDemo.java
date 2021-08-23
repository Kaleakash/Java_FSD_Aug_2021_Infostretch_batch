package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//class MyConsumer implements Consumer<Integer>{
//	@Override
//	public void accept(Integer t) {
//		System.out.println("Value is "+t);
//	}
//}
public class ConsumerDemo {
	public static void main(String[] args) {
		//Consumer<Integer> c1 = new MyConsumer();
//		c1.accept(100);
//		c1.accept(200);
//		c1.accept(300);
//		Consumer<Integer> c2 = (v)->System.out.println("Value is "+v);
//		c2.accept(10);
//		c2.accept(20);
//		c2.accept(30);
		List<Integer> list = new ArrayList<>();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		//list.forEach(c1);
		list.forEach(v->System.out.println(v));
	}
}
