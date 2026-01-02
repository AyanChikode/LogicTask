package com.LogicTask;
import java.util.Scanner;
public class Sum_Of_N_Number {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int Num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=Num; i++) {
			sum += i;
//			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
