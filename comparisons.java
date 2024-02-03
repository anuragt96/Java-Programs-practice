package org.example;

public class comparisons {

    public static void main(String[] args) {

        int a=2,b=4,c=5;

        //without operators
        if(a>b)
            System.out.println("a is greater");
        else if (a>c)
        {
            System.out.println("a is greater");
        }
        else System.out.println("b is greater");

        //using & operator for the comparisons
        if(a>b && a>c)
        {
            System.out.println("a is greater");
        } else if (b>a && b>c)
        {
            System.out.println("b is greater");
        }
        else System.out.println("c is greater");
    }
}
