package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

   
    @Test
    public void queueTest(){
        //Given
        Problem03 prac = new Problem03();
        int[] arr = {2,1,5,3,4};
        //When
        int actual = prac.findBribeCount(arr);
        int expected = 3;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void queueTest1(){
        //Given
        Problem03 prac = new Problem03();
        int[] arr = {1,2,5,3,7,8,6,4};
        //When
        int actual = prac.findBribeCount(arr);
        int expected = 7;
        //Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void queueTest2(){
        //Given
        Problem03 prac = new Problem03();
        int[] arr = {1,2,5,3,4,7,8,6};
        //When
        int actual = prac.findBribeCount(arr);
        int expected = 4;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void queueTest3(){
        //Given
        Problem03 prac = new Problem03();
        int[] arr = {2,5,1,3,4};
        //When
        int actual = prac.findBribeCount(arr);
        int expected = 0;
        //Then
        Assert.assertEquals(expected, actual);
    }

}
