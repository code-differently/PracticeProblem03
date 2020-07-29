package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void minBribes_notChaoticTest1(){
        // Given
        Integer expected = 5;

        // When
        Integer actual = Problem03.minBribes(new Integer[]{ 3, 4, 1, 5, 2 });

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minBribes_notChaoticTest2(){
        // Given
        Integer expected = 3;

        // When
        Integer actual = Problem03.minBribes(new Integer[]{ 2, 1, 5, 3, 4 });

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minBribes_notChaoticTest3(){
        // Given
        Integer expected = 0;

        // When
        Integer actual = Problem03.minBribes(new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 });

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minBribes_notChaoticTest4(){
        // Given
        Integer expected = 0;

        // When
        Integer actual = Problem03.minBribes(new Integer[]{ 1 });

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minBribes_notChaoticTest5(){
        // Given
        Integer expected = 1;

        // When
        Integer actual = Problem03.minBribes(new Integer[]{ 2, 1 });

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minBribes_isChaoticTest1(){
        // Given
        Integer expected = -1;

        // When
        Integer actual = Problem03.minBribes(new Integer[]{ 2, 5, 1, 3, 4 });

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minBribes_isChaoticTest2(){
        // Given
        Integer expected = -1;

        // When
        Integer actual = Problem03.minBribes(new Integer[]{ 4, 2, 1, 3 });

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void cloneTest(){
        // Given
        Integer[] expected = {1,2,3};

        // When
        Integer[] actual = Problem03.clone(expected);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
