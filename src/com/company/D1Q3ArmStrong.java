package com.company;

import java.util.Scanner;

public class D1Q3ArmStrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp, sum = 0;
        int r ;
        temp = num;


       while (num>0)
       {

        r = num % 10;
        num = num / 10;
        sum = sum + r*r*r;
         }

       if(sum == temp)
           System.out.println("It's an Armstrong Number");
       else
           System.out.println("Not an Armstrong Number");
    }
}
