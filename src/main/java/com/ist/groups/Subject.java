package com.ist.groups;

/**
 * The Subject class
 * @author michael
 * @version 1.0,  08/19/16
 */
public class Subject {
    private String id;
    private String name;

    /**
     * Constructor
     * @param id is a String
     * @param name is a String
     */
    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gives back concatenated form of id and name
     * @return a string
     */
    @Override
    public String toString() {
        return id + "-" + name;
    }

    /**
     * Override equality for subject objects based on their unique id
     * @param obj is an Object
     * @return true if the object matches with subject object otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Subject))
            return false;
        Subject subject = (Subject) obj;
        return id.equals(subject.getId());
    }

    /**
     * Gives back Id of a student
     * @return String object
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gives back name of the subject
     * @return String object
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets/edits name of the subject
     * @param name is a String object
     */
    public void setName(String name) {
        this.name = name;
    }
}
