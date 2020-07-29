package com.stayready;

import java.util.Arrays;

public class Problem03 
{
    
    /* Worked with Brent Oliver
    Step 1: Create a method that takes in an array argument
    Step 2: Create an integer to count how many moves are made
    Step 3: Create a new array and allocated the new array with sorted array
    Step 4: Compare both arrays if the person from the original is more than 2 spaces ahead its too chaotic
    Step 5: If not too chaotic increase moves by 1
    Step 6: Output depending if too chaotic or not
    
    
    
    
    
    */

    public void minimumBribes(int [] arr)
    {
        int [] sorted  = arr;
        Arrays.sort(sorted);
        int moves = 0;

        for (int i = arr.length-1; i >0; i--)
        {
            for (int j = 0;j < arr.length;j++)
            {
                if (sorted[j] == arr[i])
                {
                    int distance = i - j;
                    System.out.println(distance);
                    if (distance > 2)
                    {
                        System.out.println("Too chaotic");
                    }
                    else
                    {
                        moves++;
                    }
                }
            }
        }
        System.out.println(moves);
    }
}
