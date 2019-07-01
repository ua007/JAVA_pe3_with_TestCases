package com.stackroute.pe3;

public class StudentMarks {
    public static String GradeChecker(int numOfStudent,int[] stuGrades)
    {

        int k=0;
        for(int i=0;i<numOfStudent;i++)
        {
            if(stuGrades[i]>=0 && stuGrades[i]<=100)
                k=0;
            else
            {
                k=1;
                break;
            }
        }
        if(k==1)
            return("Grade out of Bound");
        else
            return("All Grades between 0 to 100");
    }
}
