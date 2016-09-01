package com.ist.groups;

import java.util.ArrayList;
import java.util.List;

/**
 * GradeLevel implements grades of students
 * @author michael
 * @version 1.0,  08/19/16
 */
public class GradeLevel {
    private String id;
    private List<Subject> mandatorySubjects; // mandatory subjects for a grade level
    private List<Subject> electiveSubjects; // elective subjects for a grade level

    /**
     * Constructor
     * @param id is a String
     */
    public GradeLevel(String id) {
        this.id = id;
        mandatorySubjects = new ArrayList<Subject>();
        electiveSubjects = new ArrayList<Subject>();
    }

    /**
     * Add mandatory subjects to a grade level
     * @param subject is the Subject object
     */
    public void addMandatorySubject(Subject subject) {
        mandatorySubjects.add(subject);
    }

    /**
     * Add elective subjects to a grade level
     * @param subject is the Subject object
     */
    public void addElectiveSubject(Subject subject) {
        electiveSubjects.add(subject);
    }

    /**
     * Removes subject from mandatory or elective subjects
     * @param subject is the Subject object
     * @return true if the subject is removed from the grade level, false otherwise.
     */
    public boolean removeSubject(Subject subject) {
        boolean removed = removeMandatorySubject(subject);
        if (!removed)
            removed = removeElectiveSubject(subject);
        return removed;
    }

    /**
     * Removes subject from mandatory subjects (accessed through remove subject)
     * @param subject is the Subject object
     * @return true if the subject is removed from the grade level, false otherwise
     */
    private boolean removeMandatorySubject(Subject subject) {
        for (Subject s : mandatorySubjects) {
            if (s.equals(subject)) {
                mandatorySubjects.remove(s);
                return true;
            }
        }
        return false;
    }

    /**
     * Removes subject from elective subjects (accessed through remove subject)
     * @param subject is the Subject object
     * @return true if the subject is removed from the grade level, false otherwise
     */
    private boolean removeElectiveSubject(Subject subject) {
        for (Subject s : electiveSubjects) {
            if (s.equals(subject)) {
                electiveSubjects.remove(s);
                return true;
            }
        }
        return false;
    }

    /**
     * Gives back total number of subjects registered in a grade level
     * @return Integer
     */
    public int getTotalNumberSubjects() {
        return mandatorySubjects.size() + electiveSubjects.size();
    }

    /**
     * Gives back collection of mandatory subjects for a grade level
     * @return List of Subject objects
     */
    public List<Subject> getMandatorySubjects() {
        return mandatorySubjects;
    }

    /**
     * Gives back collection of elective subjects for a grade level
     * @return List of Subject objects
     */
    public List<Subject> getElectiveSubjects() {
        return electiveSubjects;
    }

    /**
     * Gives back the unique Id of a subject
     * @return String object
     */
    public String getId() {
        return id;
    }
}