package com.ist.groups;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements group of students
 * @author michael
 * @version 1.0,  08/19/16
 */
public class Group {
    private String id;
    private String name;
    private List<Subject> subjectsGiven; // subjects provided by the group
    private List<Student> joinedStudents; // students joined the group
    private int min; // minimum capacity of students in a group
    private int max; // maximum capacity of students in a group

    /**
     * constructor
     * @param id is a String
     * @param name is a String
     * @param min is an int
     * @param max is an int
     */
    public Group(String id, String name, int min, int max) {
        this.id = id;
        this.name = name;
        this.min = min;
        this.max = max;
        this.subjectsGiven = new ArrayList<Subject>();
        this.joinedStudents = new ArrayList<Student>();
    }

    /**
     * Add a subject to Group
     * @param subject is the Subject Object
     */
    public void addSubject(Subject subject) {
        subjectsGiven.add(subject);
    }

    /**
     * Removes subject from the group
     * @param subject is the Subject Object
     * @return true if the subject is removed from the grade level, false otherwise
     */
    public boolean removeSubject(Subject subject) {
        return subjectsGiven.remove(subject);
    }

    /**
     * Gives back collection of subjects given in the group
     * @return List of Subject objects
     */
    public List<Subject> getSubjectsGiven() {
        return subjectsGiven;
    }

    /**
     * Adds a student to the group
     * @param student is a Student object
     * @return true if the student is added to the group otherwise false
     */
    public boolean addStudent(Student student) {
        if (joinedStudents.size() < max) {
            joinedStudents.add(student);
            return true;
        }
        // capacity is full, can't add studentId
        return false;
    }

    /**
     * Removes a student from the group
     * @param student is a Student object
     * @return true if the student is removed from the group otherwise false
     */
    public boolean removeStudent(Student student) {
        return joinedStudents.remove(student);
    }

    /**
     * Gives back total number of students who joined the group
     * @return integer
     */
    public int totalNumberOfStudents() {
        return joinedStudents.size();
    }

    /**
     * Gives back total number of subjects that will be taken by the group
     * @return integer
     */
    public int totalNumberOfSubjects() {
        return subjectsGiven.size();
    }

    /**
     * Looks for a student whether he/s belongs to the group
     * @param student is a Student object
     * @return true if student is found in the group otherwise false
     */
    public boolean containsStudent(Student student) {
        return joinedStudents.contains(student);
    }

    /**
     * Look for a subject if it is given in the group
     * @param subject is a Subject object
     * @return true if the subject is given in the group otherwise false
     */
    public boolean containsSubject(Subject subject) {
        return subjectsGiven.contains(subject);
    }

    /**
     * Removes added students in a group if the minimum number of the group is not reached
     * @return null if no students are removed, otherwise returns List of students that are removed from the group
     */
    public List<Student> unplaceStudents() {
        List<Student> unplaced = null;
        if (joinedStudents.size() < min) {
            unplaced = new ArrayList<Student>(joinedStudents);
            joinedStudents.clear();
        }
        return unplaced;
    }

    /**
     * Gives back enrolled students in a group
     * @return List of Student objects
     */
    public List<Student> getJoinedStudents() {
        return joinedStudents;
    }

    /**
     * Gives back the unique id of the group
     * @return String object
     */
    public String getId() {
        return id;
    }

    /**
     * Gives back the name of the group
     * @return String object
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the group
     * @param name is a String object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gives back the minimum number of students allowed in a group
     * @return integer
     */
    public int getMin()  {
        return min;
    }

    /**
     * Sets the minimum number of students allowed in a group
     * @param min is an integer
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * Gives back the maximum number of students allowed in a group
     * @return integer
     */
    public int getMax() {
        return max;
    }

    /**
     * Sets the maximum number of students allowed in a group
     * @param max is an integer
     */
    public void setMax(int max) {
        this.max = max;
    }

}
