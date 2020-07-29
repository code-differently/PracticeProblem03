package com.stayready;

public class Problem03 {

    // determines minimum bribes without element up more than 2 indexes
    public String minimumBribes(int[] q) {
        Integer bribes = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                return "Too Chaotic";
            }
            // nested for loop compares all elements up to i index to the specific element at i;
            for (int j = 0; j < i; j++) {
                if (q[j] > q[i]) {
                    bribes++;
                }
            }
        }
        return bribes.toString();
    }
}
