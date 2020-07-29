package com.stayready;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class Problem03Test {
    @Test
    public void minimumBribesTest(){
        //Given
        String expected = "3";
        //When
        Problem03 problem = new Problem03();
        String actual = problem.minimumBribes(new int[]{2, 1, 5, 3, 4});
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest2(){
        //Given
        String expected = "Too chaotic!";
        //When
        Problem03 problem = new Problem03();
        String actual = problem.minimumBribes(new int[]{2, 5, 1, 3, 4});
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest3(){
        //Given
        String expected = "4";
        //When
        Problem03 problem = new Problem03();
        String actual = problem.minimumBribes(new int[]{2, 1, 5, 4, 3});
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest4(){
        //Given
        String expected = "Too chaotic!";
        //When
        Problem03 problem = new Problem03();
        String actual = problem.minimumBribes(new int[]{5, 4, 3, 2, 1});
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest5(){
        //Given
        String expected = "Too chaotic!";
        //When
        Problem03 problem = new Problem03();
        String actual = problem.minimumBribes(new int[]{1, 5, 3, 2, 4});
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest6(){
        //Given
        String expected = "6";
        //When
        Problem03 problem = new Problem03();
        String actual = problem.minimumBribes(new int[]{3, 4, 5, 1, 2});
        //Then
        Assert.assertEquals(expected,actual);
    }
}
