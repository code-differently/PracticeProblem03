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
    public void passesMinimumBribesWithNoOneTest() {
        String expectedOutput = "0";

        String queue = "";
        String actualOutput = briberyQueue.minimumBribes(queue);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void passesMinimumBribesWithOnePersonTest() {
        String expectedOutput = "0";

        String queue = "1";
        String actualOutput = briberyQueue.minimumBribes(queue);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void passesMinimumBribesWithMultiplePeopleTest() {
        String expectedOutput = "3";

        String queue = "2 1 5 3 4";
        String actualOutput = briberyQueue.minimumBribes(queue);

        assertEquals(expectedOutput, actualOutput);
    }

}
