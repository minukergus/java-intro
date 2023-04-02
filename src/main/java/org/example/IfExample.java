package org.example;

public class IfExample {
    public static void main(String[] args) {
        System.out.println("Now, lets talk about your plans for tonight");
        int age = 26;

        if (age >= 18) {
            // if condition is true execute this block
            System.out.println("Lucky You, You are an adult.");
            System.out.println("Go party! :)");
        } else {
            // if condition is false execute this block
            System.out.println("Wait few more years :)");
            System.out.println("Go home!");
        }
    }
}
