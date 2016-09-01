package com.ist.groups;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The Subject class
 * @author michael
 * @version 1.0,  08/19/16
 */
public class Teacher extends Person {

    private String id;
    private double salary;
    private List<Subject> subjects; // list of subjects a teacher can teach

    /**
     * constructor
     * @param id is a String object
     * @param fullName is a String object
     * @param gender is an enum
     * @param personNumber is a String object
     * @param dob is Date object
     * @param email is a String object
     * @param phone is a String object
     * @param address is the Address object
     * @param salary is a double
     */
    public Teacher(String id
            , String fullName
            , Gender gender
            , String personNumber
            , Date dob
            , String email
            , String phone
            , Address address
            , double salary
    ){
        super(fullName, gender, personNumber, dob, email, phone, address);
        this.id = id;
        this.salary = salary;
        this.subjects = new ArrayList<Subject>();
    }

    /**
     * contructor (basic info)
     * @param id is a String object
     * @param fullName is a String object
     * @param gender is a String object
     * @param personNumber is a String object
     */
    public Teacher(String id, String fullName, Gender gender, String personNumber) {
        this(id, fullName,gender,personNumber,null,"", "", null, 0.0);
    }

    /**
     * Override equality for teacher objects based on their unique id
     * @param obj is an Object
     * @return true if the object matches with teacher object, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Teacher))
            return false;
        Teacher teacher = (Teacher) obj;
        return id.equals(teacher.getId());
    }

    /**
     * Adds list of subjects the teacher can teach
     * @param subject is the Subject object
     */
    public void canTeach(Subject subject){
        subjects.add(subject);
    }

    /**
     * Removes subject from the list of subjects the teacher can taught
     * @param subject is the Subject object
     * @return true if the subject is removed, otherwise false.
     */
    public boolean removeSubject(Subject subject) {
        for (Subject s : subjects) {
            if (s.equals(subject)) {
                subjects.remove(subject);
                return true;
            }
        }
        return false;
    }

    /**
     * Gives back list of subjects the teacher can taught
     * @return List of Subjects
     */
    public List<Subject> getSubjects(){
        return subjects;
    }

    /**
     * Gives back the unique id of the teacher
     * @return String object
     */
    public String getId(){
        return id;
    }

    /**
     * Set/edit the salary of the teacher
     * @param salary is a double
     */
    public void setSalary(Double salary){
        this.salary = salary;
    }

    /**
     * Gives back the salary of the teacher
     * @return double
     */
    public Double getSalary(){
        return salary;
    }
}