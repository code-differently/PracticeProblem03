package com.stayready;

/**
 * Step 1: Create a method that takes in an String argument
 * Step 2: Create an int to count how many moves are made
 * Step 3: Go through iteration of array if more than 2 moves = too chaotic
 * Step 4: Compare the number with the index.
 * Step 5: Return amount of Swaps.
 */

public class Problem03 {

    public String swap(int[] str) {
        int swapAmount = 0;
        for(int i= 0; i < str.length-1;i++){
            if(str[i]-(i+1) > 2) { 
                return "Too Chaotic";
            } else if(str[i+1] != str[i]+1){
                swapAmount++;
                }
            }
        return "" +swapAmount;
         
    }


}
