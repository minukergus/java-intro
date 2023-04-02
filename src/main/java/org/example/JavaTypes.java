package org.example;

public class JavaTypes {
    public static void main(String[] args) {
        // System.out.print.ln - use it for printing data to console
        System.out.println("JavaTypes");

        // put anything inside as comments
        // base java types
        // for numbers
        // int is just for storing numbers
        // age is variable
        int age = 10;
        System.out.println(age);
        age = 15;
        System.out.println(age);
        // age = "Triin"; wrong code
        String myName = "Triin";

        System.out.println(myName);
        myName = "Katariina";
        System.out.println(myName);
        System.out.println("My name is: " + myName);
        String surname = "Tamsalu";
        System.out.println("My surname is: " + surname);
        // I am name + surname
        System.out.println("My full name is: " + myName + " " + surname);
        // char is for storing single characters

        System.out.println("minimum int number is:" + Integer.MIN_VALUE);
        System.out.println("maximum number is:" + Integer.MAX_VALUE);
        long biggerNumber = 1;
        System.out.println("Minimum short is: " + Long.MIN_VALUE);
        System.out.println("Maximum short is: " + Long.MAX_VALUE);

        // short
        System.out.println("Minimum short is: " + Short.MIN_VALUE);
        System.out.println("Maximum short is: " + Short.MAX_VALUE);

        // byte
        System.out.println("Minimum byte is: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte is: " + Byte.MAX_VALUE);

        boolean trueOrFalce = true;
        trueOrFalce = false;
        System.out.println("boolean variable current value: " + trueOrFalce);

        age = 30;
        boolean isAdult = age >= 18;
        System.out.println("isAdult current value: " + isAdult);

    }
}
