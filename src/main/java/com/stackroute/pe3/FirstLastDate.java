package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class FirstLastDate
{
    public String firstLastDate()
    {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String res=String.valueOf((df.format(c.getTime())));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        res=res+" "+String.valueOf(df.format(c.getTime()));
        return res;
    }

}