package com.stackroute.pe3;

public class ConsequitiveNumbers
{
    public String checkConsequitive(String numbers)
    {
        String[] arr=numbers.split(",");
        int diff=Integer.valueOf(arr[0])-Integer.valueOf(arr[1]);
        if((diff==1||diff==-1))
        {
            int flag=0;
            for(int i=1;i<arr.length-1;i++)
            {
                if(Integer.valueOf(arr[i])-Integer.valueOf(arr[i+1])!=diff)
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