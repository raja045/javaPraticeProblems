package com.company;

import java.util.Scanner;

public class D1Q5FirstDigit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first_digit;

        first_digit = num;

        while(first_digit >= 10)
        {
            first_digit = first_digit / 10;
        }

        int last_digit = num%10;

        System.out.println("The first digit of number "+num +"---> "+first_digit);
        System.out.println("The last digit of number "+num +"---> "+last_digit);
    }
}
