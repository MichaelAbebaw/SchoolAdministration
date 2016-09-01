package com.ist.groups;

import java.util.Date;

/**
 * Implements person
 * @author michael
 * @version 1.0,  08/19/16
 */
public class Person {

    private String fullName;
    private Gender gender;

    /**
     * enumeration for male or female
     */
    enum Gender {
        MALE, FEMALE
    }

    private String personNumber;
    private Date dateOfBirth;
    private String email;
    private String phone;
    private Address address;

    /**
     * constructor
     * @param fullName is a String
     * @param gender is an enum
     * @param personNumber is a String
     * @param dob is a Date
     * @param email is a String
     * @param phone is a String
     * @param address is an object to Address class
     */
    public Person(String fullName
            , Gender gender
            , String personNumber
            , Date dob
            , String email
            , String phone
            , Address address){

        this.fullName = fullName;
        this.gender = gender;
        this.personNumber = personNumber;
        this.dateOfBirth = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    /**
     * constructor (basic)
     * @param fullName is a String
     * @param gender is a STring
     * @param personNumber is a String
     * @param dob is a Date
     */
    public Person(String fullName, Gender gender, String personNumber, Date dob) {
        this(fullName,gender,personNumber,dob,"", "", null);
    }

    /**
     * gives back full name concatenating with gender
     * @return String object
     */
    @Override
    public String toString() {
        return fullName + " (" + getGender() + ")";
    }

    /**
     * Gives back the gender
     * @return either male or female
     */
    public String getGender() {
        return gender == Gender.MALE ? "male" : "female";
    }

    /**
     * Gives back full name of a person
     * @return String object
     */
    public String getFullName(){
        return fullName;
    }

    /**
     * Gives back personal number of a person
     * @return String object
     */
    public String getPersonNumber(){
        return personNumber;
    }

    /**
     * Gives back dob of a person
     * @return Date object
     */
    public Date getBirthDate(){
        return dateOfBirth;
    }

    /**
     * Sets email address of a person
     * @param email is a String object
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Gives back an email address of
     * @return String object
     */
    public String getEmail(){
        return email;
    }

    /**
     * Sets a phone number of a person
     * @param phone is a String object
     */
    public void setPhoneNumber(String phone){
        this.phone = phone;
    }

    /**
     * Gives back phone number of a person
     * @return String object
     */
    public String getPhoneNumber(){
        return phone;
    }

    /**
     * Sets address object
     * @param address is the Address object
     */
    public void setAddress(Address address){
        this.address = address;
    }

    /**
     * Gives back address object
     * @return Address object
     */
    public Address getAddress(){
        return address;
    }
}
