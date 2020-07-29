package com.stayready;

public class Problem03 {

    /**
     * Partner: Josiah
     * 
     * Step 1: Creates a method that takes in a array and iterate through given array descending
     * Step 2: Create an integer to check for min brides or "swaps"
     * Step 3: In each iteration check to see if index value is greater than index position
     * Step 4: If greater than 0 and less then or equal to 2 increase moves
     * Step 5: else If current element is more than two places from its original place return Too Chaotic
     * 
     */

    static String minimumBribes(int[] givenArray) {

        int minBribes = 0;

        for(int i = givenArray.length - 1; i >= 0; i--) {
            int bribes  = givenArray[i] - (i + 1);

            if(bribes > 0 && bribes <= 2) {
                minBribes += bribes;
            }

            else if (bribes > 2){
                return "Too Chaotic";
            }
        }
        return "Minimum number of bribes: " + minBribes;
    }
}
