package com.ist.groups;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements classes of students in a school
 * @author michael
 * @version 1.0,  08/19/16
 */
public class Klass {
    private String id;
    private String name;
    private List<Student> studentList; // students in the class

    /**
     * Klass constructor
     * @param id is an integer
     * @param name is a string
     */
    public Klass(String id, String name) {
        this.id = id;
        this.name = name;
        studentList = new ArrayList<Student>();
    }

    /**
     * Gives back the unique id of the class
     * @return a String object
     */
    public String getId() {
        return id;
    }

    /**
     * Gives back the name of the class
     * @return a String object
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the class
     * @param name is a String object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds a student to the class
     * @param student is the Student object
     */
    public void enrollStudent(Student student) {
        studentList.add(student);
    }

    /**
     * Removes a student from a class
     * @param student is the Student object
     * @return true if the student is removed from the class, false otherwise
     */
    public boolean removeStudent(Student student) {
        for (Student s : studentList) {
            if (s.equals(student)) {
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a student is enrolled in the class
     * @param student is the Student object
     * @return true if the student is contained in the class otherwise false
     */
    public boolean containsStudent(Student student) {
        return studentList.contains(student);
    }

    /**
     * Gives back the total number of students enrolled in a class
     * @return integer
     */
    public int totalNumberStudents() {
        return studentList.size();
    }

    /**
     * Gives back collection of students enrolled in a class
     * @return list of Student objects
     */
    public List<Student> getStudents() {
        return studentList;
    }

}
