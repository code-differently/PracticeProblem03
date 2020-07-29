package com.stayready;

public class Problem03 {
    // Need variable for holding total bribes
    // More than two bribes, return Too chaotic

    // Step 1: Start from beginning of array and iterate through the array
    // Step 2: Determine distance from original place (moving backward in line, forward in array)
    // Step 3: If current element is more than two places from its original place return Too Chaotic
    // Step 4: For each distance from original place (not more than two) than add distance to count of bribes
    // Step 5: Increase incrementer by number of bribes to skip over
    // Step 5: Return the count

    // 2 3 1 5 4  - 3
    // 2 1 3 5 4  - 2
    // 1 2 3 5 4  - 1
    // 1 2 3 4 5

    public String minimumBribes(int[] q) {
        int minBribes = 0;

        for(int i = 0; i < q.length; i++) {
            int bribes = q[i] - (i + 1);
            if(bribes > 0 && bribes <= 2) {
                minBribes += bribes;
            } else if(bribes > 2) {
                return "Too Chaotic";
            }
        }

        return minBribes + "";
    }

}
