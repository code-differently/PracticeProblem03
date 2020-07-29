package com.stayready;

public class Problem03 {

    /*

    Game plan: 

    First, check if possible
    
    Create a sorted array
    Compare the index to the value-1 + 2 = choatic

    Then check

    If the proceeding number is incorrect, count for one swap.

    {1,2,4,3,5} = **
    {2,5,3,4,1} = ****
    {3,1,2,4,5} = **

    */
    //Step one create fucntion to check for too many swaps 
    public static Boolean swapChecks(Integer[] array)
    {
        boolean tooManySwaps  = true;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] - i-1 > 2) 
            {
                tooManySwaps = false;    
            }    
        }
        return tooManySwaps; 

    }

    public static Integer countSwaps(Integer[] ary){

        if(!swapChecks(ary)){//If swap is chaotic

            System.out.println("Too Chaotic");
            return 0;
        }

        int swapCnt = 0;

        for(int i = 0; i < ary.length-1; i++){

            if (ary[i+1] != ary[i]+1){

                swapCnt++;
            }
        }
        return swapCnt;
    }

    

}
