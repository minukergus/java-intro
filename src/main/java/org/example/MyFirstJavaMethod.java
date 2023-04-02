package org.example;

public class MyFirstJavaMethod {
    public static
    // function has got a name: main
    // every function needs some input parameters - located inside braces e.g. String [] args
    // return type (result) - void - at the beginning of the method signature (public static void (String[] args))

    void main(String[] args) {
        // call method using its name
        describeMe();
        System.out.println("one");
        describeMe();
        //TODO: fix problems
        System.out.println("two");
        describeMe();


    }
    public static  void describeMe() {
        System.out.println("Hi, my name is Triin");
        System.out.println("I am a future Java programmer");

    }
}
