package com.stayready;

public class Problem03 {

    /**
     * Partner: Josiah
     * 
     * Step 1: Creates a method that takes in a array
     * Step 2: Iterate through given array
     * Step 3: In each iteration check to see if index value is greater than index position
     * Step 4: If greater than 2 then "Too chaotic"
     * Step 5: ...
     * 
     */

    static int minimumBribes(int[] givenArray) {

        int bribes = 0;

        for(int i = givenArray.length - 1; i >= 0; i--)
        {
            int currentPosition  = givenArray[i] - (i + 1);
            
            if(currentPosition > 2)
            { 
                bribes = 404; //assuming that bribes is min 3 or greater
                System.out.println("CHAOTIC");
                break; 
            }
            else{
               int compare = Math.max(0, givenArray[i]-2);
                
                for(int j = compare; j <i; j++)
                {
                    if(givenArray[j] > givenArray[i]) 
                    {
                        bribes++;
                    }
                }
            }
        }
        return bribes;
    }
}
