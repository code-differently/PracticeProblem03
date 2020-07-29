package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test 
{
    Problem03 pb3;
    @Before
    public void initialize()
    {
        pb3 = new Problem03();
    }

    @Test
    public void bribeTest1()
    {
        int [] queue = {2,1,5,3,4};
        String expected = "3";

        String actual = pb3.minimumBribes(queue);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bribeTestChaotic()
    {
        int [] queue = {2,5,1,3,4};
        String expected = "Too Chaotic";

        String actual = pb3.minimumBribes(queue);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bribeTest2()
    {
        int [] queue = {3,2,1,5,4};
        String expected = "2";

        String actual = pb3.minimumBribes(queue);

        Assert.assertEquals(expected, actual);
    }
}
