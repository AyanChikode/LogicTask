package com.LogicTask;
import java.util.*;
public class Odd_Of_First_N_Number{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int odd = 1;
		int sum = 0;
		
		for(int i = 1 ; i<=num; i++) {
		 sum += odd;
		 odd += 2;
		}
		System.out.println("Sum of first " + num + " Odd number = " +sum);
	}
			
}

// 