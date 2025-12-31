package com.LogicTask;
import java.util.Scanner;
public class Maximum_Of_Four_Number {
		public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 4 Number:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			if(num1 > num2 && num1 > num3 && num1 > num4) {
				System.out.println("Number 1 is Maximum:"+num1);
			}
			else if(num2 > num3 && num2 > num4 && num2 > num1) {
				System.out.println("Number 2 is Maximum:"+num2);
			}
			else if(num3 > num4 && num3 > num2 && num3 > num1) {
				System.out.println("Number 3 is Maximum:"+num3);
			}
			else {
				System.out.println("Number 4 is Maximum:"+num4);
			}
		}
}
