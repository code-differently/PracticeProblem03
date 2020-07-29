package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {
    
    @Test
    public void swapCheckTest(){
        //Given
        Problem03 problem03 = new Problem03();
        Integer[] array = {1,2,3,4,5};
        Integer numberOfSwaps = 2;
        //When 
        Boolean expected = false;
        Boolean actual = problem03.swapCheck(array, numberOfSwaps);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countSwapsTest(){
        //Given
        Problem03 problem03 = new Problem03();
        Integer[] arr = {3,1,2,4,5};
        //When 
        Integer expected = 2;
        Integer actual = problem03.minimumBribes(arr);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
