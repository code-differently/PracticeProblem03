package com.stayready;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RollerCoasterBriberyTest {
    private RollerCoasterBribery briberyQueue;

    @Before
    public void setup() {
        briberyQueue = new RollerCoasterBribery();
    }

    @Test
    public void exceedsMinimumBribesTest() {
        String expectedOutput = "Too Chaotic";

        String queue = "2 5 1 3 4";
        String actualOutput = briberyQueue.minimumBribes(queue);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void passesMinimumBribesTest() {
        String expectedOutput = "3";

        String queue = "2 1 5 3 4";
        String actualOutput = briberyQueue.minimumBribes(queue);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void passesMinimumBribesTest2() {
        String expectedOutput = "3";

        String queue = "2 1 5 3 4 6 7 8";
        String actualOutput = briberyQueue.minimumBribes(queue);

        assertEquals(expectedOutput, actualOutput);
    }
}
