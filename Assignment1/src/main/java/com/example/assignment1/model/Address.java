package com.example.assignment1.model;

public class Address<String> {
    private int streetNumber;
    private String street;
    private String city;
    private int postalCode;
    private String state;
    private String country;


    public Address(int streetNumber, String street, String city, int postalCode, String state, String country) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
        this.country = country;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return state;
    }

    public void setProvince(String province) {
        this.state = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}