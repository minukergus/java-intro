package org.example;
public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let's play with objects");
        Person mariusz = new Person();
        Person birgit = new Person();
        birgit.name = "birgit";
        System.out.println("mariusz name is: " + mariusz.name);
        mariusz.name = "mariusz";
        mariusz.surname = "pastuszka";
        mariusz.age = 40;
        System.out.println("Object after assigning some values");
        System.out.println("mariusz.name is " + mariusz.name);
        System.out.println("mariusz.address is: " + mariusz.personAddress);
        System.out.println("birgit.name is: " + birgit.name);
        mariusz.name = "maniek";
        System.out.println("mariusz.name is " + mariusz.name);
        System.out.println("birgit.name is: " + birgit.name);
//        String person1Name;
//        String person1Surname;
//        int person1age;
        System.out.println("phoneNumber for birgit is: " + birgit.phoneNumber);
        Phone birgitPhone = new Phone();
        birgitPhone.countryCode = "372";
        birgit.phoneNumber = birgitPhone;
        System.out.println("country code for birgit is: " + birgit.phoneNumber.countryCode);
        System.out.println("Does it print??");
        System.out.println("Now let's create new person with all the values");
        Person personWithAllFields = new Person();
        personWithAllFields.name = "joe";
        personWithAllFields.surname = "doe";
        personWithAllFields.age = 18;
        Address joeDoeAddress = new Address();
        joeDoeAddress.country = "UK";
        joeDoeAddress.city = "London";
        joeDoeAddress.street = "Main";
        joeDoeAddress.flatNumber = "42D";
        joeDoeAddress.zipCode = "37-051";
        personWithAllFields.personAddress = joeDoeAddress;
        Phone joePhone = new Phone();
        joePhone.countryCode = "48";
        joePhone.phoneNumber = "4444444444";
        personWithAllFields.phoneNumber = joePhone;
        Person withConstructor = new Person(
                "Mariusz",
                "Pastuszka",
                40,
                joeDoeAddress,
                joePhone);
        Person with3Values = new Person(
                "Mariusz",
                "Pastuszka",
                40
        );
        Person withConstructor2 = new Person(
                "Mariusz",
                "Pastuszka",
                40,
                null,
                null);
        System.out.println("Now with all 3 constructors together");
        Phone newPhone = new Phone("22", "12345");
        Address newAddress = new Address("Poland",
                "Warsaw",
                "Marszalkowska",
                "40D",
                "00972");
        Person newPerson = new Person(
                "james",
                "johnes",
                18,
                newAddress,
                newPhone
        );
        System.out.println("content of newPerson variable: " + newPerson);
        Smartphone iphone13 = new Smartphone("Apple", "13");
//        iphone13.model = "14";
        iphone13.setModel("14");
//        iphone13.age = -15;

        System.out.println("iphone age is: " + iphone13.getAge());

        iphone13.setModelAndBrand("13 pro", "OnePlus");
    }
}