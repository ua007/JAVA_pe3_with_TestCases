/*Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/

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
