package com.ist.groups;

import java.util.Date;

/**
 * Implements Student class
 * @author michael
 * @version 1.0,  08/19/16
 */
public class Student extends Person {

    private String id;
    private GradeLevel gradeLevel; // grade level of the student e.g. 1,2,3,...

    /**
     * constructor
     * @param id is a String object
     * @param fullName is a String object
     * @param gender is enum
     * @param personNumber is a String object
     * @param gradeLevel is the GradeLevel object
     * @param dob is Date object
     * @param email is a String object
     * @param phone is a String object
     * @param address is the Address object
     */
    public Student (String id
            , String fullName
            , Gender gender
            , String personNumber
            , GradeLevel gradeLevel
            , Date dob
            , String email
            , String phone
            , Address address
    ){

        super(fullName, gender, personNumber, dob, email, phone, address);
        this.id = id;
        this.gradeLevel = gradeLevel;
    }

    /**
     * constructor(with basic info.)
     * @param id is a String object
     * @param fullName is a String object
     * @param gender is an enum
     * @param personNumber is a String object
     * @param gradeLevel is the GradeLevel object
     */
    public Student(String id
            , String fullName
            , Gender gender
            , String personNumber
            , GradeLevel gradeLevel
    ){
        this(id, fullName, gender, personNumber, gradeLevel, null, "", "", null);
    }

    /**
     * Concatenates id, fullname, person number, and gender of a student
     * @return string object
     */
    @Override
    public String toString() {
        return "id: " + id + ", full name: " + getFullName() + ", personNumber: " + getPersonNumber() + ", gender: " + getGender();
    }

    /**
     * Override equality for student objects based on their id.
     * student id is unique, there can never be students with the same id
     * @param obj is an Object
     * @return true if the object matches a student object otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student))
            return false;
        Student student = (Student) obj;
        return id.equals(student.getId());
    }

    /**
     * Gives back id of a student
     * @return String object
     */
    public String getId(){
        return id;
    }

    /**
     * Gives back grade level of a student
     * @return GradeLevel object
     */
    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the grade level of a student
     * @param gradeLevel is GradeLevel object
     */
    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}