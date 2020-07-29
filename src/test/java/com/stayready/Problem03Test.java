package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    Problem03 problem03;

    @Test
    public void swapcheckTest()
    {
        //Given 
        problem03 = new Problem03();
        int[] input = {2,1,5,3,4};
        //When
        String expected= "3";
        String actual = problem03.swap(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swapcheckTest2()
    {
        //Given 
        problem03 = new Problem03();
        int[] input = {1,5,2,3,4};
        //When
        String expected= "Too Chaotic";
        String actual = problem03.swap(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swapcheckTest3()
    {
        //Given 
        problem03 = new Problem03();
        int[] input = {2,5,1,3,4};
        //When
        String expected= "Too Chaotic";
        String actual = problem03.swap(input);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
