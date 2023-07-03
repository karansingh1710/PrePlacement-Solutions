package LanguageSpecific;

import java.util.Scanner;

// Write a Java program to declare and initialize variables of different data types (int, double, String) with appropriate identifiers.
public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        double d;
        float f;
        String s;
        char c;
        long l;
        short sh;
        byte b;
        System.out.println("Enter a byte value :");
        b = sc.nextByte();
        System.out.println("Enter a short value ");
        sh = sc.nextShort();
        System.out.println("Enter a char value ");
        c=sc.next().charAt(0);
        System.out.println("Enter an int value");
        i = sc.nextInt();
        System.out.println("Enter a long value");
        l = sc.nextLong();
        System.out.println("Enter a float value");
        f = sc.nextFloat();
        System.out.println("Enter a double value");
        d = sc.nextDouble();
        System.out.println("Enter a String ");
        s=sc.next();
System.out.println("\n*********************************\n");
        System.out.println("Byte "+b);
        System.out.println("Short  "+sh);
        System.out.println("Char "+c);
        System.out.println("Int "+i);
        System.out.println("Long "+l);
        System.out.println("Float "+f);
        System.out.println("Double "+d);
        System.out.println("String "+s);
    }
}
