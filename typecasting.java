package org.example;

public class typecasting {

    public static void main(String[] args) {

        int a = 4;

        //widening casting
        //converting integer value to double
        double b = a;
        System.out.println(b);

        //narrowing casting
        //means converting large datatype into the smaller ones
        //for this we have to just write down the datatype at the starting of the variable

        double variable_1 = 9.123;
        //now converting this variable into integer

        int d = (int) variable_1;

        System.out.println("variable1 "+variable_1);
        System.out.println("converted: " +d);
    }
}
