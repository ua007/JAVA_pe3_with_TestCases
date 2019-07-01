package com.stackroute.pe3;

public class PlacesWithoutVowels
{
    public String placesWithoutVowels(String places)
    {
        places=places.replaceAll("a|e|i|o|u|A|E|I|O|U","");
        return places;

    }
}