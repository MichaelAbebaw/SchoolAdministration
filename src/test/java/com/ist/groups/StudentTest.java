package com.ist.groups;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student("S1", "Helen Kasparov", Person.Gender.FEMALE, "990811-3572", new GradeLevel("8"));
    }

    @Test
    public void testToString() throws Exception {
        assertEquals(student.toString(), "id: S1, full name: Helen Kasparov, personNumber: 990811-3572, gender: female");
    }
}