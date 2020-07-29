package com.stayready;

public class Problem03 {

    public boolean swapCheck(Integer[] array, Integer numberOfSwaps){
        /*
        1) Compare the difference between each item in new positions and original positions to determine
        if there are too many swaps

        2) If there are too many swaps, (more than 2) then return "too chaotic"

        3) Iterate through the array with for loop to determine the total amount of bribes

        4) If next element in array does not equal to current element plus 1, a bribe has occurred

        */
        
            Boolean tooManySwaps = false;
            for (int i = 0; i < array.length; i++) 
            {
                if (array[i] - i -1 > numberOfSwaps) 
                {
                    tooManySwaps = true; 
                }    
            }
            return tooManySwaps;
        }

    public Integer minimumBribes(Integer[] array){
        int bribes = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] - (i + 1) > 2)
            return -1;

            for(int j = 0; j < i; j++){
                if(array[j] > array[i])
                bribes++;
            }
            
        }
        return bribes;
    }
    

        
    }

