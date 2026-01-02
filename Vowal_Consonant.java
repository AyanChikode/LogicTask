package com.LogicTask;
import java.util.Scanner;

public class Vowal_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch >= 'a' && ch <= 'z') {  
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel");
            } else {
                System.out.println(ch + " is a Consonant");
            }
        } else {
            System.out.println(ch + " is not an Alphabet");
        }
    }
}
