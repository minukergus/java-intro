package org.example;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Lets play with objects");
        Person Triin = new Person();
        Person Birgit = new Person();

        System.out.println("Triin name is: " + Triin.name);
        Triin.name = "Triin";
        Triin.surname = "Tamsalu";
        Triin.age = 43;


        System.out.println("Object after assigning some values");
        System.out.println("Triin.name is " + Triin.name);
        System.out.println("Info for this person: " + Triin.name + Triin.surname + Triin.age);
        System.out.println("Triin.address is " + Triin.personAddress);



        System.out.println("phoneNumber for Triin is: "+ Triin.phoneNumber);
        Phone TriinPhone = new Phone();
        TriinPhone.countryCode = "+372";
        Triin.phoneNumber = TriinPhone;
        System.out.println("The countryCode for Triin is: " + Triin.phoneNumber.countryCode);
        System.out.println("Does it print it??");

        System.out.println("Lets create new person with all the values");
        Person personWithAllFields = new Person();
        personWithAllFields.name = "Katariina";
        personWithAllFields.surname = "Suur";
        personWithAllFields.age = 35;

        Address katariinaSuurAddress = new Address();
        katariinaSuurAddress.country = "EST";
        katariinaSuurAddress.city = "Tartu";
        personWithAllFields.personAddress = katariinaSuurAddress;

        Phone katariinaSuurPhone = new Phone();
        katariinaSuurPhone.countryCode = "+372";
        personWithAllFields.phoneNumber = katariinaSuurPhone;


    }
}
