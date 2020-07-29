package com.stayready;

import java.util.Arrays;

public class Problem03 {

    // Step 1. Convert String queue to array


    public String minimumBribes(String q){
        Integer count = 0;
        Integer difference = 0;
        Integer differenceTracker = 0;
        // Convert string to integer array
        String[] stringInts = q.split(" ");
        int[] numbers = new int[stringInts.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringInts[i]);
        }

        for (int j = 0; j < numbers.length- 1; j++) {
            if (numbers[j]>numbers[j+1]){
                difference = numbers[j] - numbers[j+1];
                differenceTracker += difference;
            }
        }

        count = differenceTracker;

        if (differenceTracker > 3){
            return "Too Chaotic";
        }
        else{
            return count.toString();
        }
    }
}
