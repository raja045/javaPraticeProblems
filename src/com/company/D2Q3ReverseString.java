package com.company;

public class D2Q3ReverseString {
    public static void main(String[] args)
    {
        String str = "Raja";
        String rev =null;

        int len = str.length();

        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
