package com.ist.groups;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SubjectTest {

    private List<Subject> subjectList;

    @Before
    public void setUp() throws Exception {
        subjectList = new ArrayList<Subject>();
        subjectList.add(new Subject("100","Maths"));
        subjectList.add(new Subject("101","Swedish"));
        subjectList.add(new Subject("103","French"));
        subjectList.add(new Subject("104","History"));
    }

    @After
    public void tearDown() throws Exception {
        subjectList.clear();
    }

    @Test
    public void testToString() throws Exception {
        for (Subject subject : subjectList) {
            assertEquals(subject.toString(), subject.getId() + "-" + subject.getName());
        }
    }
}