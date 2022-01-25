package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class D2Q1SumNaturalNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int sum =0;
        if(n>0)
        {
        for(int i=1; i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of natural numbers of "+n+" is "+sum);
        }
        else
            System.out.println("Enter the positive Integer");
    }
}
