package com.LogicTask;
import java.util.Scanner;
public class Simple_Interrest {
	public void Simple(double Price, double Rate, double Time) {
		double SI = (Price*Rate*Time)/100;
		double CI = Price*(1+Rate/100) * Time - Price;
		System.out.println("Simple Interrest is ="+SI);
		System.out.println("Compound Interrest ="+CI);
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter simple interrest:");
		double Price = sc.nextDouble();
		double Rate = sc.nextDouble();
		double Time = sc.nextDouble();
		Simple_Interrest Si = new Simple_Interrest();
		Si.Simple(Price, Rate, Time);
	}

}
