package com.stayready;

public class Problem03 { 
    //create a function to determine whether too many swaps were made
    public Boolean swapChecks(Integer[] array, Integer numOfSwaps)
    {
        Boolean tooManySwaps = false;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] - i -1 > numOfSwaps)  //if the array at ith element minus the index minus 1 (for offset) is less than 2 
            {
                tooManySwaps = true; //set too many swaps to true
            }    
        }
        return tooManySwaps;
    }

    //create a function to count the swaps 
    public Integer countSwaps(Integer[] array)
    {
        if(swapChecks(array, 2)== true)
        {
            return -1; //if there are too many swaps return -1
        }
        Integer swaps = 0; 
        for (int i = 0; i < array.length-1; i++)
        {
            if (array[i+1] != array[i]+1) //if the next element isn't equal to the current element plus 1
            {
                swaps++;   // increment swaps
            }    
        }
        return swaps; 
    }
    //comments to it work through logic
    // 1,2,3,4,5
    //1,5,3,4,2
    //array[i] = 5
    // i =1 
    //4

}
