

package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsequitiveNumbersTest {
    ConsequitiveNumbers ob;
    @Before
    public void setUp() throws Exception {
        ob=new ConsequitiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenAnAscendingNumbersShouldReturnTrue()
    {
        String res=ob.checkConsequitive("42,43,44,45,46,47");
        assertEquals("42,43,44,45,46,47 are consequitive",res);
    }

    @Test
    public void giveADescendingNumbersShouldReturnTrue()
    {
        String res=ob.checkConsequitive("90,89,88,87,86,85");
        assertEquals("90,89,88,87,86,85 are consequitive", res);
    }

    @Test
    public void givenNonConsequitiveNumbersShouldReturnFalse()
    {
        String res=ob.checkConsequitive("23,24,32,21,45");
        assertEquals("23,24,32,21,45 are non consequitive",res);
    }
}