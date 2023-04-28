package com.prev.demo;

import com.next.demo.Work;

public class Test {
	public static void main(String [] args) {
		Work w=new Work();
		int mul=w.mul(4, 7);
		System.out.println("The multiplication is " + mul);
	}
}
