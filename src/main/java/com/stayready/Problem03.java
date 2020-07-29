package com.stayready;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem03 {

    /**
     *
     * @param input - integer array to determine if possible
     * @return swapCnt - the minimum number of swaps
     *   0   1   2   3   4
     * [ 3 | 4 | 1 | 5 | 2 ] - input
     * [ 1 | 2 | 3 | 4 | 5 ] - sortedInput
     *   0   1   2   3   4
     *
     * LOGIC:
     * Step #1. Sort a copy of input, making a var (sortedInput).
     * Step #2. Get each element from input,
     *          hold its input position in a var (inputPos)
     * Step #3. Look for that same element in sortedInput,
     *          and hold its sortedInput position in a var (sortedPos).
     * Step #4. If an element is two or less spots to the left of its original spot
     *          (that is, if its inputPos is two or less than its sortedPos), then
     *          get the difference between the spots and add it to a swaps counter (swapCount).
     *          Otherwise, it's "Too Chaotic", so return -1.
     * Step #5. If the element's inputPos is greater than its sortedPos,
     *          than that element didn't swap, it GOT SWAPPED by some other element.
     *
     *
     */
    public static Integer minBribes(Integer[] input){

        // #1
        Integer[] sortedInput = clone(input); // creates clone of input
        Arrays.sort(sortedInput);  // then sorts it
        int inputPos = 0;
        int swapCnt = 0;

        // #2
        for (int idx = 0; idx < input.length; idx++) {
            inputPos = idx;
        // #3
            int sortedPos = Arrays.asList(sortedInput).indexOf(input[idx]); // finds the index of the element in sortedInput
            if (sortedPos - inputPos <= 2 && sortedPos - inputPos >= 0) {
                swapCnt += sortedPos - inputPos;
            } else if (sortedPos - inputPos > 2){
                return -1;
            }
        }
        return swapCnt;
    }

    /**
     *
     * @param input - Integer array to clone
     * @return - a cloned Integer array with the same contents as input
     */
    public static Integer[] clone(Integer[] input){
// First idea:
//
//        Integer[] clone = new Integer[input.length];
//        for (int idx = 0; idx < input.length; idx++) {
//            clone[idx] = input[idx];
//        }
//        return clone;

        return Arrays.copyOf(input, input.length); // returns copy of input
    }

    // This problem could also go as a boolean method, isChaotic?? Just a thought
    // Make boolean method isChaotic later
}
