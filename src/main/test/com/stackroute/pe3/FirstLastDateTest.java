package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastDateTest {
    FirstLastDate ob;

    @Before
    public void setUp() throws Exception {
        ob=new FirstLastDate();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void theProgramReturnsFirstAndLastDateOfWeek()
    {
        String res=ob.firstLastDate();
        assertEquals("Mon 01/07/2019 Sun 07/07/2019",res);
    }
}