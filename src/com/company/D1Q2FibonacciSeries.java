package com.company;

public class D1Q2FibonacciSeries {
    public static void main(String[] args)
    {
        int num2 = 1;
        int num1 =0;
        int num3;
        System.out.print("Fibonacci Series : "+num1+" "+num2);
        for(int i=0;i<10;i++)
        {
            num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
