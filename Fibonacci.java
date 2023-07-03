package LanguageSpecific;

import java.util.Scanner;

//  Write a Java program to print the Fibonacci series up to a given number using a for loop.
public class Fibonacci {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int t1=0;
    int t2=1;
    System.out.print(t1+" "+t2+" ");
    for(int i=3; i<=num; i++){
        int temp=t1+t2;
        System.out.print(temp+" ");
        t1=t2;
        t2=temp;
    }
}
}
