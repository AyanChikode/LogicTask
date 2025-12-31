package com.LogicTask;
import java.util.Scanner;
public class Leap_year {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Leap Year:");
			int Year = sc.nextInt();
			if(Year%4==0) {
				System.out.println("Year is Leap Year:"+Year);
			}
			else {
				System.out.println("Year is not Leap Year:"+Year);
			}
		}
		
}
