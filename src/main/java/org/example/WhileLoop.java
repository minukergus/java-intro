package org.example;

public class WhileLoop {
    public static void main(String[] args) {
        // repeat that line 100 times
  //      System.out.println("Lets ülay with loops");
        // while loop is going to be executed as long as condition is true
        // infinite loop is never going to end
        //while (true)
            System.out.println("Lets play with loops");
            int numberOfRepetitions = 10;
            while (numberOfRepetitions > 0) {
                System.out.println("Loop is running, number of repetitions is: " + numberOfRepetitions);

                numberOfRepetitions-=2;// numberOfRepetitions = numberOfRepetitions - 2;
                numberOfRepetitions--; // numberOfRepetitions = numberOfRepetitions - 1;
        }
        System.out.println("After loop");
        System.out.println("number of repetitions is: " + numberOfRepetitions);
    }
}
