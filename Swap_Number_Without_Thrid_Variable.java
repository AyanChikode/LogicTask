package com.LogicTask;

public class Swap_Number_Without_Thrid_Variable {
	public static void main(String [] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swap:");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		 System.out.println("After Swap");
		 System.out.println("a ="+a);
		 System.out.print("b ="+b);
	}
}