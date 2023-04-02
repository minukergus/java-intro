package org.example;

public class Calculator {

    public static void main(String[] args) {
        int result1 = addTwoNumbers(3, 5);
        int result2 = addTwoNumbers(10, 22);
        System.out.println("result1 is: " + result1);
        System.out.println("result2 is: " + result2);
    }
    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("I am going to add two numbers");
        int  result = firstNumber + secondNumber;
        System.out.println("Final result is: " + result);

        return result;
    }
}
