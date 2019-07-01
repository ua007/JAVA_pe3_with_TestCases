package com.stackroute.pe3;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentMarksTest {
    @Test
    public void givenGradeIntegerArrayShouldReturnMessage()
    {
        StudentMarks grade=new StudentMarks();

        String result=grade.GradeChecker(3, new int[]{23, 45, 34});
        assertEquals("All Grades between 0 to 100",result);
    }
    @Test
    public void givenGradeIntegerArrayOutOfBoundShouldReturnMessage()
    {
        StudentMarks grade=new StudentMarks();

        String result=grade.GradeChecker(3, new int[]{23, 123, 34});
        assertEquals("Grade out of Bound",result);
    }

}