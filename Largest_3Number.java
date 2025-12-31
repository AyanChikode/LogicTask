package com.LogicTask;
import java.util.Scanner;
public class Largest_3Number {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 3 Number:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			if(num1 > num2 && num1 > num3) {
				System.out.println("num1 is largest:"+num1);
			}
			else if(num2 > num1 && num2 > num3){
				System.out.println("num2 is largest:"+num2);
			}
			else {
				System.out.println("num3 is largest:"+num3);
			}
		}
}
