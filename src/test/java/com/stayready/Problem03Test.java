package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void swapTest(){
        Assert.assertEquals("2", Problem03.swap("1 2 5 3 4"));
    }

    @Test
    public void swapTest2(){
        Assert.assertEquals("Too Chaotic", Problem03.swap("2 5 1 3 4"));
    }

    @Test
    public void swapTest3(){
        Assert.assertEquals("Too Chaotic", Problem03.swap("1 5 2 3 4"));
    }

    @Test
    public void swapTest4(){
        Assert.assertEquals("Too Chaotic", Problem03.swap("4 5 1 2 3"));
    }

    @Test
    public void swapTest5(){
        Assert.assertEquals("0", Problem03.swap("1 2 3 4 5"));
    }

    @Test
    public void swapTest6(){
        Assert.assertEquals("3", Problem03.swap("2 1 5 3 4"));
    }
}
