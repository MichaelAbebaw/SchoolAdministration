package com.ist.groups;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeLevelTest {

    private GradeLevel gradeLevel =  new GradeLevel("1");

    @Before
    public void setUp() throws Exception {
        gradeLevel.addMandatorySubject(new Subject("100","Maths"));
        gradeLevel.addMandatorySubject(new Subject("101","Swedish"));
        gradeLevel.addElectiveSubject(new Subject("103","French"));
        gradeLevel.addElectiveSubject(new Subject("104","History"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addMandatorySubject() throws Exception {
        assertEquals("Maths", gradeLevel.getMandatorySubjects().get(0).getName());
        assertEquals("Swedish", gradeLevel.getMandatorySubjects().get(1).getName());
    }

    @Test
    public void addElectiveSubject() throws Exception {
        assertEquals("French", gradeLevel.getElectiveSubjects().get(0).getName());
        assertEquals("History", gradeLevel.getElectiveSubjects().get(1).getName());
    }

    @Test
    public void removeSubject() throws Exception {
        int totalSubjects = gradeLevel.getTotalNumberSubjects();
        boolean removed = gradeLevel.removeSubject(new Subject("100","Maths"));
        assertEquals(removed, true);
        assertEquals(gradeLevel.getTotalNumberSubjects(), totalSubjects - 1);
    }
}