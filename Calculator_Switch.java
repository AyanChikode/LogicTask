package com.LogicTask;
import java.util.Scanner;
public class Calculator_Switch {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number:");
		double Num1 = sc.nextDouble();
		System.out.println("Enter the Second Number:");
		double Num2 = sc.nextDouble();
		System.out.println("Enter your Opition:");
		System.out.println("1.Addition\n");
		System.out.println("2.Substraction\n");
		System.out.println("3.Multipication\n");
		System.out.println("4.Division\n");
		int ch = sc.nextInt();
		double result;
		switch(ch) {
		case 1: result = Num1 + Num2 ;
					System.out.println("Addition is ="+result);
					break;
		case 2: result = Num1 - Num2;
					System.out.println("Substraction is ="+result);
					break;
		case 3: result = Num1 * Num2;
					System.out.println("Multipication is ="+result);
					break;
		case 4: result = Num1 / Num2;
					System.out.println("Division is ="+result);
					break;
		default :	System.out.println("Wrong Choice");
		}
	}
}
