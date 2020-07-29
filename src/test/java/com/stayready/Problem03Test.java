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
        Integer[] array = {1,2,3,4,5};
        //When
        Boolean expected= true;
        Boolean actual = Problem03.swapChecks(array);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void swapCheckTest2()
    {
        //Given 
        Integer[] array = {1,5,3,4,2};
        //When 
        Boolean expected = false; 
        Boolean actual = Problem03.swapChecks(array);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void swapCheckTest3()
    {
        //Given 
        Integer[] array = {2,1,5,3,4};
        //When 
        Boolean expected = true; 
        Boolean actual = Problem03.swapChecks(array);
        //Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSwapCnt(){

        Integer[] test = {3,1,2,4,5};

        Integer expected = 2;
        Integer actual = Problem03.countSwaps(test);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSwapCnt2(){
        
        Integer[] test = {1,2,3,4,5};

        Integer expected = 0;
        Integer actual = Problem03.countSwaps(test);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSwapCnt3(){
        
        Integer[] test = {2,1,5,3,4};

        Integer expected = 3;
        Integer actual = Problem03.countSwaps(test);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFalseAnswer(){
        
        Integer[] test = {5,4,3,2,1};

        Integer expected = 0;
        Integer actual = Problem03.countSwaps(test);

        Assert.assertEquals(expected, actual);

    }

    
}
