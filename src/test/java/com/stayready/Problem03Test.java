package com.stayready;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem03Test
{   
    Problem03 prob = new Problem03();

    @Test
    public void swapTest1()
    {   
        //given 
        Integer [] array = { 4, 65, 8, 23 };
        Integer  a = 2;
        Integer b = 1;

        //when
        Problem03.swap(array, a, b);
        Integer [] expected = { 4, 8, 65, 23 };
        Integer [] actual = array;

        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void swapTest2()
    {   
        //given 
        Integer [] array = { 1, 2, 5, 4, 3 };
        Integer  a = 2;
        Integer b = 4;

        //when
        Problem03.swap(array, a, b);
        Integer [] expected = { 1, 2, 3, 4, 5 };
        Integer [] actual = array;

        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void swapTest3()
    {   
        //given 
        Integer [] array = { 95, 99, 98, 97, 96, 100 };
        Integer  a = 0;
        Integer b = (array.length - 1);

        //when
        Problem03.swap(array, a, b);
        Integer [] expected = { 100, 99, 98, 97, 96, 95 };
        Integer [] actual = array;

        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void minBribesTest1()
    {   
        //given 
        Integer [] array = { 2, 1, 5, 3, 4};

        //when
        Integer expected = 3;
        Integer actual = Problem03.minimumBribes(array);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void minBribesTest2()
    {   
        //given 
        Integer [] array = { 2, 5, 1, 3, 4};

        //when
        Integer expected = 0;                           //returns 0 swaps, prints "Too chaotic"
        Integer actual = Problem03.minimumBribes(array);

        //then
        assertEquals(expected, actual);
    }
}
