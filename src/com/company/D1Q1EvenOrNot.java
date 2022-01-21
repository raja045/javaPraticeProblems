package com.company;

import java.util.Scanner;

public class D1Q1EvenOrNot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter the Number: ");
            int num = sc.nextInt();
            if (num%2==0)
            {
             System.out.println("Given Number: "+num+" ---> Even");
             System.out.println(" ");
            }
            else if(num%2 != 0)
            {
                System.out.println("Given Number: "+num+" ----> Not Even");
                System.out.println(" ");
            }
        }
    }
}
