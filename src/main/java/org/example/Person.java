package org.example;

public class Person {
   public Person(String name, String surname, int age, String IDNumber, Address personAddress, Phone phoneNumber) {
      this.name = name;
      this.surname = surname;
      this.age = age;
      this.IDNumber = IDNumber;
      this.personAddress = personAddress;
      this.phoneNumber = phoneNumber;
   }
   // default constructor - has no arguments
   // it can funcion like a method
   // no return type
   // named like a class
   public Person() {
   }

   String name;
   String surname;
   int age;
   String IDNumber;
   Address personAddress;
   Phone phoneNumber;


}
