package com.stayready;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem03
{
    public static Integer minimumBribes( Integer [] array )
    {
        Integer swaps = 0;
        Integer length = array.length;

        for (int i = length - 1; i >= 0; i--)
        {
            if(array[i] != (i + 1))
            {
                if(((i - 1) >= 0) && array[i - 1] == (i + 1))
                {
                    swaps ++;
                    swap(array, i, (i - 1));
                }
                else if(((i - 2) >= 0) && array[i - 2] == (i + 1))
                {
                    swaps += 2;
                    swap(array, (i - 2), (i - 1));
                    swap(array, (i - 1), i);
                }
                else
                {
                    System.out.println("Too chaotic");
                    break;
                }
            }
        }
        return swaps;
    }

    public static void swap( Integer [] array, Integer a, Integer b)//function to swap 2 elements
    {   
        List<Integer> targetList = Arrays.asList(array);            //array --> list
        Collections.swap(targetList, a, b);                         //swap elements at given index
        array = targetList.toArray(new Integer[targetList.size()]); //list  --> array

    }
}
