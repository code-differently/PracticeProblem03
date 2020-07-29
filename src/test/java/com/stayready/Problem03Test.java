package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test{

    
    @Test
    public void minimumBribesTest1(){
        int[] given = {1, 2, 4, 3, 5};
        int expected = 1;

        int actual = Problem03.minimumBribes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void minimumBribesTest2(){
        int[] given = {1, 2, 3, 4, 5};
        int expected = 0;

        int actual = Problem03.minimumBribes(given);

        Assert.assertEquals(actual, expected);
    }
    
    @Test
    public void minimumBribesTest3(){
        int[] given = {5, 1, 2, 3, 4};
        int expected = 404;

        int actual = Problem03.minimumBribes(given);

        Assert.assertEquals(actual, expected);
    }
}
