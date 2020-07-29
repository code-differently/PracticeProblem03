package com.stayready;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem03 {
    public String minimumBribes(int[] queue) {
        String output = "";
        int swaps = 0;
            for (int i = queue.length - 1; i >= 0; i--) {
                /*
                if element at index i minus i plus 1
                or if element jumped more than 2 spaces its too chaotic
                */
                if (queue[i] - (i + 1) > 2) {
                    output = "Too chaotic!";
                }
                /*
                else it goes into the for loop
                j uses max which checks to make sure as i is decrementing that it is larger than 0
                if it is j is then made the max
                 */
                for (int j = Math.max(0, queue[i] - 2); j < i; j++) {
                    //if element at index j is greater than element of index i
                    //that means a bribe has been made and a swap must be incremented
                    if(queue[j] > queue[i]){
                        swaps++;
                    }
                }
            }
            /*
            checking to see if there were no chaotic elements skipping too far ahead
            if not then output equals the number of swaps made converted into a string
             */
            if(output.length() == 0) {
                output = Integer.toString(swaps);
            }
        return output;
    }
}
