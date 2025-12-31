package com.LogicTask;
import java.util.Scanner;
public class Largest_2_Number {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 2 Number:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1 > num2) {
				System.out.println("num1 is largest:"+num1);
			}
			else {
				System.out.println("num2 is largest:"+num2);
			}
		}
}
