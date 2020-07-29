package com.stayready;
import org.junit.Test;
import org.junit.Assert;

public class Problem03Test 
{
    @Test
    public void isChaoticTest()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[]  arr = {2, 5 ,1 ,3, 4};

        //When
        boolean expected = true;
        boolean actual = problem03.chaotic(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortingTest01()
    {
        //Given
        Problem03 problem3 = new Problem03();
        Integer[]  arr = {1, 2, 4, 3, 5};

        //When
        Integer expected = 1;
        Integer actual = problem3.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortingTest02()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[]  arr = {3, 2, 1, 4};

        //When
        Integer expected = 3;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newYearsLineTest01()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[]  arr = {2, 1, 5, 3, 4};

        //When
        Integer expected = 3;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newYearsLineTest02()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[]  arr = {2, 5, 1, 3, 4};

        //When
        Integer expected = 0;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newYearsLineTest03()
    {
        //Given
        Problem03 problem03 = new Problem03();
        Integer[]  arr = {1, 2, 5, 3, 4, 7, 8, 6};

        //When
        Integer expected = 4;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }
}