package com.LogicTask;
import java.util.*;
public class Even_Of_Frist_N_Number {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i<=num; i++) {
//			if(num % 2 == 0) {
			
				sum += 2 * i;
				
//			}
		}
//		System.out.println("number is even");
		
		System.out.println(sum);
	}

}
