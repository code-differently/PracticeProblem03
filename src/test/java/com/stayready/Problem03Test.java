package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test {

    private static final int[] input1 = {2, 1, 5, 3, 4};
    private static final int[] input2 = {2, 5, 1, 3, 4};
    private static final int[] input3 = {2, 3, 1, 5, 4};
    private static final int[] input4 = {3, 1, 2, 5, 6, 4, 8, 7};

    Problem03 p3;
    @Before
    public void initialize() {
        p3 = new Problem03();
    }

    @Test
    public void minimumBribesTest1() {
        // Given
        String expected = "3";

        // When
        String actual = p3.minimumBribes(input1);

        //
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minimumBribesTest2() {
        // Given
        String expected = "Too Chaotic";

        // When
        String actual = p3.minimumBribes(input2);

        //
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minimumBribesTest3() {
        // Given
        String expected = "3";

        // When
        String actual = p3.minimumBribes(input3);

        //
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minimumBribesTest4() {
        // Given
        String expected = "5";

        // When
        String actual = p3.minimumBribes(input4);

        //
        Assert.assertEquals(expected, actual);
    }
}
