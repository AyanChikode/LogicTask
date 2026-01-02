package com.LogicTask;
import java.util.Scanner;
public class AbsValue {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int absvalue;
		if(num < 0 ) {
			absvalue = -num;
		}
		else {
			absvalue = num;
		}
		System.out.println("Absoult value is =" +absvalue);
	}
}
