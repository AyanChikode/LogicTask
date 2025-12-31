package com.LogicTask;
import java.util.Scanner;
public class Grade_Mark {
		public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Marks:");
			double Mark = sc.nextDouble();
			if(Mark >= 75 && Mark < 100) {
				System.out.println("Grade is A+");
			}
			else if(Mark >= 60 && Mark < 75) {
					System.out.println("Grade is A");
				}
			else if(Mark >= 50 && Mark < 60) {
				System.out.println("Grade is B");
			}
			else if(Mark >= 35 && Mark < 50) {
				System.out.println("Grade is C");
			}
			else if(Mark >= 0 && Mark < 35) {
				System.out.println("Study Hard");
			}
			else {
				System.out.println("Invalid Marks");
			}
		}
}
