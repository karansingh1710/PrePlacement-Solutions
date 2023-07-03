package LanguageSpecific;

import java.util.Scanner;

//  Write a Java program to find the largest of three numbers using nested if-else statements.
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3) System.out.println("First");
        else if(num2>num1 && num2>num3) System.out.println("Second");
        else System.out.println("Third");
    }
}
