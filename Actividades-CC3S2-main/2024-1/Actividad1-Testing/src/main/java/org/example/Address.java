package org.example;

public class Address {
    private String street;
    public Address(String street){
        this.street = street;
    }

    //assuming you night need a getter for tests or other
    public String getStreet(){
        return street;
    }
}
