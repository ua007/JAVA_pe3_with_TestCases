//find if the series of nos is consecutive

package com.stackroute.pe3;

public class ConsequitiveNumbers
{
    public String checkConsequitive(String numbers)
    {
        String[] arr=numbers.split(",");//splits the string by spaces
        int diff=Integer.valueOf(arr[0])-Integer.valueOf(arr[1]);
        if((diff==1||diff==-1))
        {
            int flag=0;
            for(int i=1;i<arr.length-1;i++)
            {
                if(Integer.valueOf(arr[i])-Integer.valueOf(arr[i+1])!=diff)//difference between numbers is not one hence not consecutive
                {
                    flag=1;
                    break;
                }
            }

            if(flag==1)
            {
                return numbers+" are non consequitive";
            }

        }
        else if(diff!=1||diff!=-1)
        {
            return numbers + " are non consequitive";
        }

        return numbers+" are consequitive";

    }
}