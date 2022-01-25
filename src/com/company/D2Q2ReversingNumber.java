package com.company;

import java.util.Scanner;

public class D2Q2ReversingNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev=0,r;
        while(n!=0)
        {
            rev =rev*10 + n%10;
            n = n/10;
        }
        System.out.println("Reverse of a number is "+rev);
    }
}
