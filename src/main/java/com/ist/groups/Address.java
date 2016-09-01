package com.ist.groups;

/**
 * Address implements location details of a person
 * @author michael
 * @version 1.0,  08/19/16
 */
public class Address {

    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String country;

    /**
     * Address constructor
     * @param street is a String
     * @param city is a String
     * @param state is a String
     * @param postalCode is a String
     * @param country is a String
     */
    public Address(String street, String city, String state, int postalCode, String country){
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    /**
     * Gives back street and city address
     */
    @Override
    public String toString() {
        return this.street + "\n" + city;
    }

    /**
     * Set street address
     * @param street is a string object
     */
    public void setStreet(String street){
        this.street = street;
    }

    /**
     * Gives back street address
     * @return String object
     */
    public String getStreet(){
        return street;
    }

    /**
     * Set city address
     * @param city is a string object
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Gives back city address
     * @return String object
     */
    public String getCity(){
        return city;
    }

    /**
     * Set state address
     * @param state is a String object
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * Gives back state address
     * @return String object-
     */
    public String getState(){
        return state;
    }

    /**
     * Set postal code address
     * @param code is an integer
     */
    public void setPostalCode(int code){
        this.postalCode = code;
    }

    /**
     * Gives back postal code of an address
     * @return integer
     */
    public int getPostalCode(){
        return postalCode;
    }

    /**
     * Set country of an address
     * @param country is a String object
     */
    public void setCountry(String country){
        this.country = country;
    }

    /**
     * Gives back country of an address
     * @return String
     */
    public String getCountry(){
        return country;
    }
}