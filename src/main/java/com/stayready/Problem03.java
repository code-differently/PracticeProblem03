package com.stayready;

import java.util.Arrays;

public class Problem03 
{
    /* Worked with Brent Oliver
    Step 1: Create a method that takes in an array argument
    Step 2: Create an integer to count how many swaps are made
    Step 4: Check if the current element of the array is two spaces away from where its supposed to be
    Step 5: If not too chaotic increase moves
    Step 6: Output depending if too chaotic or not
    */

    public String minimumBribes(int [] input)
    {
       //Holds the number of swaps
        int swap = 0;
        for (int i = input.length-1;i >= 0;i--)
        {

            int bribes = input[i] - (i+1);
            if (bribes <= 2 && bribes > 0)
            {
                swap += bribes;
            }
            else if (bribes > 2)
            {
                return "Too Chaotic";
            }
        }
        return ""+swap;
    }
}
