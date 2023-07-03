package LanguageSpecific;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,count=0;
        int sum=0;
        System.out.println("Enter  Only positive numbers in the list to quit enter a negative number ");
        do{count++;
            num=sc.nextInt();
          if(num>0)  sum+=num;
          else count=count-1;
        }while(num!=0);
        System.out.println("Average : "+(float)(sum/(float)count));
    }
}
