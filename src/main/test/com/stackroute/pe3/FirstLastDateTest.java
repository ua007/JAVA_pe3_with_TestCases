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
    public void FirstAndLastDayOfTheWeek()
    {
        FirstLastDate day=new FirstLastDate();
        day.setCal(2019,6,4);
        String result1=day.getFirstDay();
        String result2=day.getLastDay();
        assertEquals("Monday 1 6 2019",result1);
        assertEquals("Sunday 7 6 2019",result2);
    }
    @Test
    public void FirstAndLastDayOfTheWeek1()
    {
        FirstLastDate day=new FirstLastDate();
        day.setCal(2019,5,29);
        String result1=day.getFirstDay();
        String result2=day.getLastDay();
        assertEquals("Monday 24 5 2019",result1);
        assertEquals("Sunday 30 5 2019",result2);
    }
    @Test
    public void FirstAndLastDayOfTheWeek2()
    {
        FirstLastDate day=new FirstLastDate();
        day.setCal(2019,10,19);
        String result1=day.getFirstDay();
        String result2=day.getLastDay();
        assertEquals("Monday 18 10 2019",result1);
        assertEquals("Sunday 24 10 2019",result2);
    }
}