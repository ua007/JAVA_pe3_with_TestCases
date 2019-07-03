//program to find out the first and last day of the week
package com.stackroute.pe3;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONDAY;

public class FirstLastDate {

    Calendar calendar = Calendar.getInstance();//instance of Calender class created

    public void setCal(int year, int mon, int date) {
        calendar.set(year, mon, date);
    }//present date is set

    public String getFirstDay() { //first day of the week is found
        calendar.add(Calendar.DATE, -calendar.get(DAY_OF_WEEK) + 2);

        return "Monday" + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR);
    }

    public String getLastDay() {//last day of the week is found
        calendar.add(Calendar.DATE, 6);
        return "Sunday" + " " + calendar.get(GregorianCalendar.DATE) + " " + calendar.get(GregorianCalendar.MONTH) + " " + calendar.get(GregorianCalendar.YEAR);
    }
}