package org.example;
public class Phone {
    String countryCode;
    String phoneNumber;
    public Phone(String countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "countryCode='" + countryCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}