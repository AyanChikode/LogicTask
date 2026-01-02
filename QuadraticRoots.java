package com.LogicTask;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are Real and Distinct");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are Real and Equal");
            System.out.println("Root = " + root);

        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are Complex and Imaginary");
            System.out.println("Root 1 = " + real + " + " + imaginary + "i");
            System.out.println("Root 2 = " + real + " - " + imaginary + "i");
        }

        sc.close();
    }
}

