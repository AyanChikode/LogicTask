package com.LogicTask;
import java.util.Scanner;
public class EBill {
		public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Unit:");
			int unit = sc.nextInt();
			double bill = 0;
			if(unit <=100) {
				bill = unit * 5;
			}
			else if(unit <=200) {
				bill = (100 * 5) + (unit-100) * 7;
			}
			else if(unit <=300) {
				bill = (100 * 5) + (100 * 7) + (unit - 200) * 10;
			}
			else {
				bill = (100 * 5) + (100 * 7) + (100 * 7) + (100 * 10) + (unit - 300) * 12;
			}
			System.out.println("Total Elecricity"+bill);
		}
}
