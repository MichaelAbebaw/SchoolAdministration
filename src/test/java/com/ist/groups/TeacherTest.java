package com.ist.groups;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TeacherTest {

    Teacher teacher;

    @Before
    public void setUp() throws Exception {
        teacher = new Teacher("T1","Steven Magnus", Person.Gender.MALE,"801110-1234");
        teacher.canTeach(new Subject("100", "Maths"));
        teacher.canTeach(new Subject("105", "Geography"));
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void canTeach() throws Exception {
        String subjectIds = "";
        for (Subject subject : teacher.getSubjects()) {
            subjectIds += subject.getId() + ",";
        }
        assertEquals(subjectIds, "100,105,");
    }

    @Test
    public void removeSubject() throws Exception {
        teacher.removeSubject(new Subject("100", "Maths"));
        assertEquals(teacher.getSubjects().get(0).getName(),"Geography");
        assertEquals(teacher.getSubjects().size(), 1);
    }
}