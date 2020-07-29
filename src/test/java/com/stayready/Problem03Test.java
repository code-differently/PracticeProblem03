package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test 
{
    @Test
    public void swapCheckTest()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[] array = {1,2,3,4,5};
        Integer numOfSwaps = 2;
        //When 
        Boolean expected =false;
        Boolean actual = problem03.swapChecks(array, numOfSwaps);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void swapCheckTest2()
    {
        //Given 
        Problem03 problem03 = new Problem03();
        Integer[] array = {1,5,3,4,2};
        Integer numOfSwaps = 2;
        //When 
        Boolean expected = true; 
        Boolean actual = problem03.swapChecks(array, numOfSwaps);
        //Then 
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void swapCheckTest3()
    {
        //Given 
        Problem03 problem03 = new Problem03();
        Integer[] array = {2,1,5,3,4};
        Integer numOfSwaps = 2;
        //When 
        Boolean expected = false;
        Boolean actual = problem03.swapChecks(array, numOfSwaps);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countSwapsTest()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[] array = {3,1,2,4,5};
        //When 
        Integer expected = 2;
        Integer actual = problem03.countSwaps(array);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countSwapsTest2()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[] array = {1,2,3,4,5};
        //When
        Integer expected = 0;
        Integer actual = problem03.countSwaps(array);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countSwapsTest3()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[] array = {2,1,5,3,4};
        //When 
        Integer expected = 3;
        Integer actual = problem03.countSwaps(array);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countSwapsTest4()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer [] array = {5,4,3,2,1};
        //When
        Integer expected = -1; 
        Integer actual = problem03.countSwaps(array);
        //Then 
        Assert.assertEquals(expected, actual);
    }

}
