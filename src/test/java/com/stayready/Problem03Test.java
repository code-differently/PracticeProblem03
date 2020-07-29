package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test{

    
    @Test
    public void minimumBribesTest1(){
        int[] given = {1, 2, 3, 5, 4};
        String  expected = "Minimum number of bribes: 1" ;

        String actual = Problem03.minimumBribes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void minimumBribesTest2(){
        int[] given = {2, 1, 3, 5, 4};
        String expected = "Minimum number of bribes: 2" ;

        String actual = Problem03.minimumBribes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void minimumBribesTest3(){
        int[] given = {2, 3, 1, 5, 4};
        String expected = "Minimum number of bribes: 3" ;

        String actual = Problem03.minimumBribes(given);

        Assert.assertEquals(actual, expected);
    }
    
    @Test
    public void minimumBribesTest4(){
        int[] given = {5, 1, 2, 3, 4};
        String expected = "Too Chaotic";

        String actual = Problem03.minimumBribes(given);

        Assert.assertEquals(actual, expected);
    }
}
