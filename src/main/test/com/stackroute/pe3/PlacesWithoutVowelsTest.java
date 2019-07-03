package com.stackroute.pe3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesWithoutVowelsTest {
    PlacesWithoutVowels r;

    @Before
    public void setUp() throws Exception {
        r=new PlacesWithoutVowels();
    }

    @After
    public void tearDown() throws Exception {
        r=null;
    }

    @Test
    public void placesWithVowelsRemoved()
    {

        String result=r.places("India pakistan");
        assertEquals("nd pkstn",result);
    }
    @Test
    public void placesWithVowelsRemoved2()
    {

        String result=r.places("India pakistan canada");
        assertEquals("nd pkstn cnd",result);
    }

    @Test
    public void placesWithVowelsRemoved3()
    {
        String result=r.places("aeiou Aeiou");
        assertEquals("",result);
    }


}