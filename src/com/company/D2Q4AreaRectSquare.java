package com.company;

class Area{
    public Double Rectangle(Double a , Double b)
    {
        return a*b;
    }

    public Double Sqaure(Double a)
    {
        return a*a;
    }
}

public class D2Q4AreaRectSquare {
    public static void main(String[] args)
    {
        Area obj = new Area();
        System.out.println("Area of Rectangle "+obj.Rectangle(12.2,13.00));
        System.out.println("Area of Square "+obj.Sqaure(12.00));
    }
}
