package org.example;

public class FunctionExample {
    public static void main(String[] args) {
        String words = "Hi, Welcome to intro to programming";
        System.out.println("Words before reversing the order of letters: "+ words);

        StringBuilder reverseHelper = new StringBuilder(words); // 1). how to create StringBuilder based on String

        reverseHelper.reverse(); // 2). how to use Reverse operation

        String revertedWords = reverseHelper.toString();
        System.out.println(revertedWords);


    }
}
