package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void minimumBribesTest1(){
        Problem03 p3 = new Problem03();
        int[] arr = {2, 1, 5, 3, 4};

        int actual = p3.minimumBribes(arr);
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minimumBribesTest2(){
        Problem03 p3 = new Problem03();
        int[] arr = {2, 5, 1, 3, 4};

        int actual = p3.minimumBribes(arr);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isChaoticTest1(){
        Problem03 p3 = new Problem03();
        int[] arr = {2, 5, 1, 3, 4};

        boolean actual = p3.isChaotic(arr);

        Assert.assertTrue(actual);
    }

    @Test
    public void isChaoticTest2(){
        Problem03 p3 = new Problem03();
        int[] arr = {2, 1, 5, 3, 4};

        boolean actual = p3.isChaotic(arr);

        Assert.assertFalse(actual);
    }

    @Test
    public void getNumSwapsTest(){
        Problem03 p3 = new Problem03();
        int[] arr = {2, 1, 5, 3, 4};

        int actual = p3.getNumSwaps(arr);
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }
}
