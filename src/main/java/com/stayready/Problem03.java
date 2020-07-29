package com.stayready;

import java.util.Arrays;
public class Problem03 {

    public static String minimumBribes(String q) {
        int[] arr = Arrays.stream(q.split(" ")).mapToInt(Integer::parseInt).toArray();

        int swaps = 0;
        for(int i = (arr.length-1); i >= 0; i--) { // for loop starting at the last digit of the array, stopping when greater then or equal to 0 while running,decrementing by 1 in the loop
            if(Integer.valueOf(arr[i])-i-1 > 2) {
                return("Too Chaotic");
            }
            int k = (Integer.valueOf(arr[i])-2 > 0) ? (Integer.valueOf(arr[i])-2) : 0;
            for (int j = k; j < i; j++) {
                if (Integer.valueOf(arr[j]) > Integer.valueOf(arr[i])) {
                    swaps++;
                }
            }
        }
        return String.valueOf(swaps);
    }
}