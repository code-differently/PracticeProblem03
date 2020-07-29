package com.stayready;

import static org.junit.Assert.*;
import org.junit.Test;

public class Problem03Test {
    Problem03 obj = new Problem03();

    @Test
    public void minimumBribesTest() {
        int[] testArr = {2, 1, 5, 3, 4};

        String expected = "3";

        assertEquals(expected, obj.minimumBribes(testArr));
    }

    @Test
    public void minimumBribesTest2() {
        int[] testArr = {2, 5, 1, 3, 4};

        String expected = "Too Chaotic";

        assertEquals(expected, obj.minimumBribes(testArr));
    }

    @Test
    public void minimumBribesTest3() {
        int[] testArr = {5, 1, 2, 3, 7, 8, 6, 4};

        String expected = "Too Chaotic";

        assertEquals(expected, obj.minimumBribes(testArr));
    }

    @Test
    public void minimumBribesTest4() {
        // 1 2 3 4 5 6 7 8
        // 5 made two bribes, 7 made two bribes, 8 made 2 bribe, 6 made 1 bribe
        // 1 2 3 5 4 6 7 8 - 1
        // 1 2 5 3 4 6 7 8 - 2
        // 1 2 5 3 4 7 6 8 - 3
        // 1 2 5 3 7 4 6 8 - 4
        // 1 2 5 3 7 4 8 6 - 5
        // 1 2 5 3 7 8 4 6 - 6
        // 1 2 5 3 7 8 6 4 - 7
        int[] testArr = {1, 2, 5, 3, 7, 8, 6, 4};

        String expected = "7";

        assertEquals(expected, obj.minimumBribes(testArr));
    }

    @Test
    public void minimumBribesTest5() {
        int[] testArr = {1, 2, 5, 3, 4, 7, 8, 6};

        String expected = "4";

        assertEquals(expected, obj.minimumBribes(testArr));
    }
}
