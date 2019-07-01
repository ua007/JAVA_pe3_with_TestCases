package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition ob;
    @Before
    public void setUp() throws Exception {
        ob=new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenTwoMatricesShouldReturnAddedMatrix()
    {
        int[][] A={{1,2},{3,4}};
        int[][] B={{4,3},{2,1}};
        int[][] result={{5,5},{5,5}};
        int[][] result1=ob.addMatrix(A,B);
        assertEquals(result,result1);
    }
}