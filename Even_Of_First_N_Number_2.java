package com.LogicTask;
import java.util.*;
public class Even_Of_First_N_Number_2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sum = 0;
		System.out.println("First " + num + " even numbers:");
		
		for(int i = 1 ; i<=num; i++) {
			int even = 2 * i;
			System.out.println(even + " ");
			sum += even;
		}
		System.out.println("\n Sum of first " +num + " even numbers = " +sum);
	}

}

// 