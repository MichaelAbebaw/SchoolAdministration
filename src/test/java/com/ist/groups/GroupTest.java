package com.ist.groups;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GroupTest {

    Group g1;
    Subject s1, s2, s3, s4;
    Student std1, std2, std3, std4, std5;

    @Before
    public void setUp() throws Exception {
        g1 = new Group("G1", "G-072", 2, 4);
        s1 = new Subject("100","Maths");
        s2 = new Subject("101","Swedish");
        s3 = new Subject("103","French");
        s4 = new Subject("104","History");

        std1 = new Student("S1", "Helen Kasparov", Person.Gender.FEMALE, "990811-3572", new GradeLevel("8"));
        std2 = new Student("S2", "Steven Magnus", Person.Gender.MALE,"801110-1234", new GradeLevel("9"));
        std3 = new Student("S3", "David Alan", Person.Gender.MALE, "940811-3662", new GradeLevel("11"));
        std4 = new Student("S4", "Eleni Leon", Person.Gender.FEMALE, "890811-7772", new GradeLevel("7"));
        std5 = new Student("S5", "Max Alex", Person.Gender.FEMALE, "920707-1352", new GradeLevel("12"));

        g1.addSubject(s1);
        g1.addSubject(s2);
        g1.addSubject(s3);
        g1.addSubject(s4);

        g1.addStudent(std1);
        g1.addStudent(std2);
        g1.addStudent(std3);
        g1.addStudent(std4);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addSubject() throws Exception {
        assertEquals(g1.totalNumberOfSubjects(), 4);
    }

    @Test
    public void removeSubject() throws Exception {
        g1.removeSubject(s1);
        assertEquals(g1.totalNumberOfSubjects(), 3);
        assertFalse(g1.containsSubject(s1));
    }

    @Test
    public void addStudent() throws Exception {

        // we can not add more than capacity
        assertFalse(g1.addStudent(std5));

        assertEquals(g1.totalNumberOfStudents(), 4);
    }

    @Test
    public void removeStudent() throws Exception {
        g1.removeStudent(std5);
        assertFalse(g1.containsStudent(std5));
        assertEquals(g1.totalNumberOfStudents(), 4);
    }

    @Test
    public void unplaceStudents() throws Exception {
        g1.removeStudent(std1);
        g1.removeStudent(std2);
        g1.removeStudent(std3);
        assertEquals(g1.totalNumberOfStudents(), 1);
        List<Student> unplaced = g1.unplaceStudents();
        assertEquals(unplaced.size(), 1);
        assertEquals(unplaced.get(0).getId(), "S4");
        assertEquals(g1.totalNumberOfStudents(), 0);
    }
}