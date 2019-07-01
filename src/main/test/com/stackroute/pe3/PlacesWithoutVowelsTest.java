package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesWithoutVowelsTest {

    PlacesWithoutVowels ob;
    @Before
    public void setUp() throws Exception {
        ob=new PlacesWithoutVowels();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenPlacesReturnRemovedVowels()
    {
        String res=ob.placesWithoutVowels("India Pakistan");
        assertEquals("nd Pkstn", res);
    }

    @Test
    public void givenAllVowelsReturnEmptyString()
    {
        String res=ob.placesWithoutVowels("AEIOUaeiou");
        assertEquals("",res);
    }
}