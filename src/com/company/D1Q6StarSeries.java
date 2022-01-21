package com.company;

public class D1Q6StarSeries {
    public static void main(String[] args)
    {
        for(int s=1; s<5; s++)
        {
            for (int r=1; r<=s; r++)
                System.out.print("*");
            System.out.println();
        }


        System.out.println();
        System.out.println();



        for(int i=1; i<5;i++)
        {
            for (int j=4;j>=i;j--)
                System.out.print(" ");
                for (int k=i;k>=1;k--)
                    System.out.print(k);


            System.out.println();
        }

    }
}
