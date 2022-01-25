package com.company;

import java.util.Scanner;

public class D2Q5RequiredOutput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        String name = sc.nextLine();
        System.out.print("Roll number:");
        int roll = sc.nextInt();
        System.out.print("Marks:");
        int marks = sc.nextInt();
        if(marks >= 90)
            System.out.print("Grade:O");
        else if(marks>=80)
            System.out.println("Grade:A1");
        else if(marks>=70)
            System.out.println("Grade:A2");
        else if(marks>=60)
            System.out.println("Grade:B1");
        else if(marks>=50)
            System.out.println("Grade:B2");
        else if(marks>=40)
            System.out.println("Grade:C1");
        else if(marks>=34)
            System.out.println("Grade:P");
        else if(marks>=0)
            System.out.println("Grade:F");

    }
}
