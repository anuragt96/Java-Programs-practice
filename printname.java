package org.example;

public class printname {

    public static void main(String[] args) {


        String name = "anurag";
        String lname = "tiwari";

        //I am using concat method in order to join my name also doing without concat method
        System.out.println("My name is : " +name+ " " +lname);

        //using concat method

        System.out.println("My name is :: " +name.concat(" ").concat(lname));
    }
}
