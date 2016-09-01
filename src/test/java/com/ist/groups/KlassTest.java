package com.ist.groups;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KlassTest {

    private Klass c1;
    private Student s1;
    private Student s2;

    @Before
    public void setUp() throws Exception {
        c1 = new Klass("C1", "1A");
        s1 = new Student("S1", "Helen Kasparov", Person.Gender.FEMALE, "990811-3572", new GradeLevel("8"));
        s2 = new Student("S2", "Josh Albert", Person.Gender.MALE, "970110-1390", new GradeLevel("9"));
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
    }

    @Test
    public void enrollStudent() throws Exception {

        assertEquals(c1.totalNumberStudents(), 2);
        assertEquals(c1.containsStudent(s1), true);
        assertEquals(c1.containsStudent(s2), true);
    }

    @Test
    public void removeStudent() throws Exception {
        c1.removeStudent(s1);
        assertEquals(c1.totalNumberStudents(), 1);
        assertEquals(c1.containsStudent(s1), false);
    }
}